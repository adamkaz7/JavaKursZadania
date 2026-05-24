package homework11;

public class Task3 {
    static String getCityOrDefault(String code) {
        return Task2.findCityByCode(code).orElse("Nieznane miasto");
    }

    public static void main(String[] args) {
        System.out.println("getCityOrDefault: " + getCityOrDefault("WA"));
        System.out.println("getCityOrDefault: " + getCityOrDefault("XX"));
        System.out.println("getCityOrDefault: " + getCityOrDefault(null));
    }
}
