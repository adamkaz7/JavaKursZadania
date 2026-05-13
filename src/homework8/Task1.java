package homework8;

class Task1 {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");

        System.out.println("First point");
        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        System.out.println();
        System.out.println("Second point");
        Pair<Object, String> p = Pair.of(null, "x");
        Object first = p.first();
        System.out.println(first);
        System.out.println(p);

        System.out.println();
        System.out.println("Third point");
        Pair<String, String> stringStringPair = Pair.of("A", "B");
//        stringStringPair.first() = "C";
        System.out.println(stringStringPair);
    }
}
