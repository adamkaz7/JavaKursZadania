package homework15.Task2;

public class Main {
    static void main() {
        Pojazd pojazd = new Pojazd();
        Samochod samochod = new Samochod();

        System.out.println(pojazd.opis());
        System.out.println(samochod.opis());

        pojazd.staraMetoda();
//        samochod.staraMetoda(); -> @Deprecated(since = "1.0",  forRemoval = true)
        samochod.nowaMetoda();

        Obliczanie dodawanie = (a, b) -> a + b;
        Obliczanie mnozenie = (a, b) -> a * b;

        System.out.println("Dodawanie: " + dodawanie.wykonaj(5,3));
        System.out.println("Mnożenie: " + mnozenie.wykonaj(5,3));
    }
}
