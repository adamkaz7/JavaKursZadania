package homework8;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }

        if (data.length == 0) {
            throw new IllegalArgumentException("Data cannot be empty");
        }

        this.data = data;
    }

    public double mean() {
        double sum = 0.0;
        for (T number : data) {
            sum += number.doubleValue();
        }
        return sum / data.length;
    }

    public double variance() {
        double meanValue = mean();
        double sum = 0.0;
        for (T number : data) {
            double difference = number.doubleValue() - meanValue;
            sum += difference * difference;
        }
        return sum / data.length;
    }

    public boolean hasSameMean(Stats<?> other, double eps) {
        if (other == null) {
            throw new NullPointerException("Other stats cannot be null");
        }
        double difference = Math.abs(this.mean() - other.mean());
        return difference <= eps;
    }
}
