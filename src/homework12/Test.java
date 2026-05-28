package homework12;

public class Test {
    public static void main(String[] args) {
        TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();

        System.out.println("Test put/get");
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        grades.put("Bob", "Math", 3);
        System.out.println("Alice, Math: " + grades.get("Alice", "Math"));
        System.out.println("Alice, CS: " + grades.get("Alice", "CS"));
        System.out.println("Bob, Math: " + grades.get("Bob", "Math"));
        System.out.println("Bob, CS: " + grades.get("Bob", "CS"));

        System.out.println("\nsize()/isEmpty()");
        System.out.println("size(): " + grades.size());
        System.out.println("isEmpty(): " + grades.isEmpty());

        System.out.println("\ncontainsKeys()/containsValue()");
        System.out.println("containsKeys(Alice, Math): " + grades.containsKeys("Alice", "Math"));
        System.out.println("containsKeys(Bob, CS): " + grades.containsKeys("Bob", "CS"));
        System.out.println("containsValue(5): " + grades.containsValue(5));
        System.out.println("containsValue(2): " + grades.containsValue(2));

        System.out.println("\nrow");
        System.out.println("row(Alice): " + grades.row("Alice"));
        System.out.println("row(Bartek): " + grades.row("Bartek"));

        System.out.println("\ncolumn");
        System.out.println("column(Math): " + grades.column("Math"));
        System.out.println("column(CS): " + grades.column("CS"));

        System.out.println("\nkeySet()");
        System.out.println("keySet(): " + grades.keySet());

        System.out.println("\nvalues()");
        System.out.println("values(): " + grades.values());

        System.out.println("\nentrySet() + for-each");
        System.out.println("key1 | key2 | value");
        for (TwoKeyMap.Entry<String, String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey1() + " | " + entry.getKey2() + " | " + entry.getValue());
        }

        System.out.println("\niterator() + for-each");
        System.out.println("key1 | key2 | value");
        for (TwoKeyMap.Entry<String, String, Integer> entry : grades) {
            System.out.println(entry.getKey1() + " | " + entry.getKey2() + " | " + entry.getValue());
        }

        System.out.println("\nremove()");
        System.out.println("remove: " + grades.remove("Alice", "Math"));
        System.out.println("get(Alice, Math): " + grades.get("Alice", "Math"));
        System.out.println("containsKeys(Alice, Math): " + grades.containsKeys("Alice", "Math"));
        System.out.println("size(): " + grades.size());

        System.out.println("\nputAll()");
        TwoKeyMap<String, String, Integer> newGrades = new NestedTwoKeyHashMap<>();
        newGrades.put("Tom", "Math", 6);
        newGrades.put("Tom", "CS", 5);
        System.out.println("putAll(newGrades)");
        grades.putAll(newGrades);
        System.out.println("grades.get(Tom, Math): " + grades.get("Tom", "Math"));
        System.out.println("grades.get(Tom, CS): " + grades.get("Tom", "CS"));
        System.out.println("grades.size(): " + grades.size());

        System.out.println("\nclear()");
        System.out.println("grades.clear()");
        grades.clear();
        System.out.println("grades.size(): " + grades.size());
        System.out.println("grades.isEmpty(): " + grades.isEmpty());
    }
}
