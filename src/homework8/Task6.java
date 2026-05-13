package homework8;

class Task6 {
    public static void main(String[] args) {
        Integer[] a = {1, null, 3};
        Integer[] b = {1, null, 3};
        Integer[] c = {1, 2, 3};

        System.out.println(ArrayUtils.arraysEqual(a, b));
        System.out.println(ArrayUtils.arraysEqual(a, c));
        System.out.println(ArrayUtils.arraysEqual(a, null));
        System.out.println(ArrayUtils.arraysEqual(null, null));
    }
}
