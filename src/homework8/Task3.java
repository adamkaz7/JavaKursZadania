package homework8;

class Task3 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        Stats<Integer> stats = new Stats<>(numbers);

        System.out.println(stats.mean());
        System.out.println(stats.variance());

        Double[] x = {2.0, 2.0};
        Double[] y = {2.001, 1.999};
        Stats<Double> statsX = new Stats<>(x);
        Stats<Double> statsY = new Stats<>(y);
        System.out.println(statsX.hasSameMean(statsY, 0.01));

        try {
            Stats<Integer> empty = new Stats<>(new Integer[]{});
        } catch (IllegalArgumentException exception) {
            System.out.println("Catch exception: " + exception.getMessage());
        }
    }
}
