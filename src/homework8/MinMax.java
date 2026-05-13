package homework8;

public final class MinMax {
    private MinMax() {

    }

    public static <T extends Comparable<? super T>> Pair<T, T> minMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        if (arr[0] == null) {
            throw new IllegalArgumentException("Array cannot be empty");
        }


        T min = arr[0];
        T max = arr[0];

        for (T element : arr) {
            if (element == null) {
                throw new IllegalArgumentException("Array element cannot be null");
            }

            if (element.compareTo(min) < 0) {
                min = element;
            }

            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return Pair.of(min, max);
    }
}
