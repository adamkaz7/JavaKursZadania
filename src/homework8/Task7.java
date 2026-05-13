package homework8;

class Task7 {
    public static void main(String[] args) {
        Triple<String, Integer, Boolean> t1 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t2 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t3 = Triple.of("id", 43, true);

        System.out.println("t1.equals(t2) -> " + t1.equals(t2));
        System.out.println("t1.equals(t3) -> " + t1.equals(t3));

        System.out.println("t1.first() -> " + t1.first());
        System.out.println("t1.second() -> " + t1.second());
        System.out.println("t1.third() -> " + t1.third());

        System.out.println(t1);
    }
}
