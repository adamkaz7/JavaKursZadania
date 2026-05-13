package homework8;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void swap(T[] arr, int i, int j) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }

        if (i < 0 || i >= arr.length) {
            throw new IndexOutOfBoundsException("Index i is out of bounds: " + i);
        }

        if (j < 0 || j >= arr.length) {
            throw new IndexOutOfBoundsException("Index j is out of bounds: " + j);
        }

        if (i == j) {
            return;
        }

        T temporary = arr[i];
        arr[i] = arr[j];
        arr[j] = temporary;
    }

    //Task 5
    public static <T> int indexOf(T[] arr, T value) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }

        for (int index = 0; index < arr.length; index++) {
            if (value == null) {
                if (arr[index] == null) {
                    return index;
                }
            } else {
                if (value.equals(arr[index])) {
                    return index;
                }
            }
        }
        return -1;
    }

    //Task 5
    public static <T> int lastIndexOf(T[] arr, T value) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }

        for (int index = arr.length - 1; index >= 0; index--) {
            if (value == null) {
                if (arr[index] == null) {
                    return index;
                }
            } else {
                if (value.equals(arr[index])) {
                    return index;
                }
            }
        }
        return -1;
    }

    //Task 6
    public static <T> boolean arraysEqual(T[] a, T[] b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int index = 0; index < a.length; index++) {
            if (a[index] == null) {
                if (b[index] != null) {
                    return false;
                }
            } else {
                if (!a[index].equals(b[index])) {
                    return false;
                }
            }
        }
        return true;
    }
}
