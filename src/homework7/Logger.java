package homework7;

public enum Logger {
    INSTANCE;

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
