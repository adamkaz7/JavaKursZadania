package homework7;

public enum Month {
    JANUARY(31, false),
    FEBRUARY(28, false),
    MARCH(31, false),
    APRIL(30, false),
    MAY(31, false),
    JUNE(30, true),
    JULY(31, true),
    AUGUST(31, true),
    SEPTEMBER(30, false),
    OCTOBER(31, false),
    NOVEMBER(30, false),
    DECEMBER(31, false);

    private int days;
    private boolean isHolidaySeason;

    Month(int days, boolean isHolidaySeason) {
        this.days = days;
        this.isHolidaySeason = isHolidaySeason;
    }

    public boolean isHolidaySeason() {
        return isHolidaySeason;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return name() + " has: " + days + " days";
    }
}
