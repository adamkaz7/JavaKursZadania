package homework7;

public enum Currency {
    PLN("zł"),
    USD("$"),
    EUR("€");

    String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
