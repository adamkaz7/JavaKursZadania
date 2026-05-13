package homework8;

class Task2 {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C"};
        ArrayUtils.swap(letters, 0, 2);
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();

//        Integer[] numbers = {1, 2, 3};
//        ArrayUtils.swap(numbers, -1, 0);
//        ArrayUtils.swap(numbers, 0, 3);
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }

        String[] xAndY = {"X", "Y"};
        ArrayUtils.swap(xAndY, 1, 1);
        for (String xY : xAndY) {
            System.out.print(xY + " ");
        }
    }
}
