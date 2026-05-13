package homework8;

class Task4 {
    public static void main(String[] args) {
        String[] words = {"aa", "b", "ccc"};
        Pair<String, String> stringStringPair = MinMax.minMax(words);
        System.out.println("Words -> (min -> " + stringStringPair.first() + ", max -> " + stringStringPair.second() + ")");

        Integer[] numbers = {5, 5, -1, 10, 10};
        Pair<Integer, Integer> integerIntegerPair = MinMax.minMax(numbers);
        System.out.println("Numbers -> (min -> " + integerIntegerPair.first() + ", max -> " + integerIntegerPair.second() + ")");

        Integer[] singleNumber = {42};
        Pair<Integer, Integer> singleNumberPair = MinMax.minMax(singleNumber);
        System.out.println("Numbers -> (min -> " + singleNumberPair.first() + ", max -> " + singleNumberPair.second() + ")");

        try {
            Integer[] arr = {1, null, 2};
            Pair<Integer, Integer> arrayNull = MinMax.minMax(arr);
            System.out.println("Numbers -> (min -> " + arrayNull.first() + ", max -> " + arrayNull.second() + ")");
        } catch (IllegalArgumentException exception) {
            System.out.println("Array contains null: " + exception.getMessage());
        }
    }
}
