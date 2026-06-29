package homework15.Task2;

public class Samochod extends Pojazd {
    @Override
    public String opis() {
        return "To jest samochod";
    }

    @Override
    @Deprecated(since = "1.0",  forRemoval = true)
    public void staraMetoda() {
        super.staraMetoda();
    }

    public void nowaMetoda() {
        System.out.println("To jest nowa metoda");
    }
}
