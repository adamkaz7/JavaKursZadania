package homework7;

public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public int calculate (int a, int b){
        return switch (this) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> {
                if (b == 0) {
                    System.out.println("Can't divide by 0");
                }
                yield a / b;
            }
        };
    }
}
