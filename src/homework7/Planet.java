package homework7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Planet {
    EARTH(new BigDecimal("5.97e24"), new BigDecimal("6.37e6")),
    MARS(new BigDecimal("6.42e23"), new BigDecimal("3.39e6"));

    private BigDecimal mass;
    private BigDecimal radius;

    Planet(BigDecimal mass, BigDecimal radius) {
        this.mass = mass;
        this.radius = radius;
    }

    static final BigDecimal FOUR = new BigDecimal("4");
    static final BigDecimal THREE = new BigDecimal("3");
    static final BigDecimal PI = new BigDecimal(Math.PI);

    public BigDecimal getDensity() {
        BigDecimal volume = FOUR
                .multiply(PI)
                .multiply(radius.pow(3))
                .divide(THREE, 10, RoundingMode.HALF_UP);

        return mass.divide(volume, 10, RoundingMode.HALF_UP);
    }
}
