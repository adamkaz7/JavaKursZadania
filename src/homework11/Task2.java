package homework11;

import java.util.Optional;

public class Task2 {
    public static Optional<String> findCityByCode(String code) {
        if (code == null) {
            return Optional.empty();
        }

        return switch (code) {
            case "WA" -> Optional.of("Warszawa");
            case "KR" -> Optional.of("Kraków");
            case "GD" -> Optional.of("Gdańsk");
            default -> Optional.empty();
        };
    }

    public static void main(String[] args) {
        System.out.println("findCityByCode('WA'): " + findCityByCode("WA"));
        System.out.println("findCityByCode('PO'): " + findCityByCode("PO"));
        System.out.println("findCityByCode('GD'): " + findCityByCode("GD"));
    }
}
