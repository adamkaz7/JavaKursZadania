package homework12;

import java.util.*;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {
    private final Map<K1, Map<K2, V>> nestedMap = new HashMap<>();

    @Override
    public V put(K1 k1, K2 k2, V value) {
        Objects.requireNonNull(k1, "k1 must not be null");
        Objects.requireNonNull(k2, "k2 must not be null");
        Objects.requireNonNull(value, "value must not be null");

        return this.nestedMap.computeIfAbsent(k1, k -> new HashMap<>()).put(k2, value);
    }

    @Override
    public V get(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "k1 must not be null");
        Objects.requireNonNull(k2, "k2 must not be null");
        Map<K2, V> map = this.nestedMap.get(k1);
        if (map == null) {
            return null;
        }
        return map.get(k2);
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "k1 must not be null");
        Objects.requireNonNull(k2, "k2 must not be null");
        Map<K2, V> map = this.nestedMap.get(k1);
        if (map == null) {
            return null;
        }
        V removed = map.remove(k2);
        if (map.isEmpty()) {
            this.nestedMap.remove(k1);
        }
        return removed;
    }

    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        Objects.requireNonNull(k1, "k1 must not be null");
        Objects.requireNonNull(k2, "k2 must not be null");
        Map<K2, V> map = this.nestedMap.get(k1);
        if (map == null) {
            return false;
        }
        return map.containsKey(k2);
    }

    @Override
    public boolean containsValue(V value) {
        Objects.requireNonNull(value, "value must not be null");
        for (Map<K2, V> map : this.nestedMap.values()) {
            if (map.containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.nestedMap.values().stream().mapToInt(Map::size).sum();
    }

    @Override
    public boolean isEmpty() {
        return this.nestedMap.isEmpty();
    }

    @Override
    public Set<TwoKeyMap.Entry<K1, K2, V>> entrySet() {
        Set<TwoKeyMap.Entry<K1, K2, V>> keysAndValue = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> map : this.nestedMap.entrySet()) {
            K1 k1 = map.getKey();
            Map<K2, V> secondMap = map.getValue();
            for (Map.Entry<K2, V> secondMapEntry : secondMap.entrySet()) {
                K2 k2 = secondMapEntry.getKey();
                V value = secondMapEntry.getValue();
                keysAndValue.add(new Entry(k1, k2, value));
            }
        }
        return keysAndValue;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        Set<Pair<K1, K2>> keys = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> map : this.nestedMap.entrySet()) {
            K1 key1 = map.getKey();
            Map<K2, V> secondMap = map.getValue();
            for (K2 key2 : secondMap.keySet()) {
                keys.add(new Pair<>(key1, key2));
            }
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
        List<V> list = new ArrayList<>();
        for (Map<K2, V> map : this.nestedMap.values()) {
            for (Map.Entry<K2, V> entry : map.entrySet()) {
                V value = entry.getValue();
                list.add(value);
            }
        }
        return list;
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {
        Objects.requireNonNull(other, "other must not be null");
        for (TwoKeyMap.Entry<? extends K1, ? extends K2, ? extends V> entry : other) {
            this.put(entry.getKey1(), entry.getKey2(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        this.nestedMap.clear();
    }

    @Override
    public Map<K2, V> row(K1 k1) {
        Objects.requireNonNull(k1, "k1 must not be null");

        Map<K2, V> map = this.nestedMap.get(k1);
        if (map == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(map);
    }

    @Override
    public Map<K1, V> column(K2 k2) {
        Objects.requireNonNull(k2, "k2 must not be null");

        Map<K1, V> map = new HashMap<>();
        for (Map.Entry<K1, Map<K2, V>> entry : this.nestedMap.entrySet()) {
            K1 k1 = entry.getKey();
            Map<K2, V> secondMap = entry.getValue();
            if (secondMap.containsKey(k2)) {
                map.put(k1, secondMap.get(k2));
            }
        }
        return map;
    }

    @Override
    public Iterator<TwoKeyMap.Entry<K1, K2, V>> iterator() {
        return this.entrySet().iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NestedTwoKeyHashMap<?, ?, ?> that = (NestedTwoKeyHashMap<?, ?, ?>) o;
        return Objects.equals(nestedMap, that.nestedMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nestedMap);
    }

    private class Entry implements TwoKeyMap.Entry<K1, K2, V> {
        private final K1 key1;
        private final K2 key2;
        private V value;

        public Entry(K1 key1, K2 key2, V value) {
            this.key1 = key1;
            this.key2 = key2;
            this.value = value;
        }

        public K1 getKey1() {
            return key1;
        }

        public K2 getKey2() {
            return key2;
        }

        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return value;
        }
    }
}
