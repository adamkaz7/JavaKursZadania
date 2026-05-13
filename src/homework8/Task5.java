package homework8;

class Task5 {
    public static void main(String[] args) {
        String[] values = {null, "a", null, "b", "a"};
        System.out.println("indexOf(values, null) = " + ArrayUtils.indexOf(values, null));
        System.out.println("lastIndexOf(values, null) = " + ArrayUtils.lastIndexOf(values, null));
        System.out.println("indexOf(values, a) = " + ArrayUtils.lastIndexOf(values, "a"));
        System.out.println("lastIndexOf(values, a) = " + ArrayUtils.lastIndexOf(values, "a"));

        String[] valuesXAndY = {"x", "y"};
        System.out.println("indexOf(valuesXAndY, \"xxx\") = " + ArrayUtils.indexOf(valuesXAndY, "xxx"));
    }
}
