package homework10;

public class Task12 {
    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }

    public static void main(String[] args) {
        TriFunction<Double, Double, Double, Double> triFunction =
                (rate, weight, maxWeight) -> rate * weight / maxWeight;

        Double[] rate = {3.0, 4.0, 5.0};
        Double[] weight = {1.0, 2.0, 3.0};

        Double sumWeight = 0.0;
        for (Double w : weight) {
            sumWeight += w;
        }

        Double average = 0.0;
        for (int i = 0; i < rate.length; i++) {
            average += triFunction.apply(rate[i], weight[i], sumWeight);
        }
        System.out.println("average is " + average);
    }
}
