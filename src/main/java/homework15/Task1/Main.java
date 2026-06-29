package homework15.Task1;

public class Main {
    public static void main(String[] args) {
        User correct = new User("HasłoMasło123!");
        User tooShort = new User("Hasło123!");
        User withoutDigit = new User("HasłoMasło!");
        User withoutSpecialChar = new User("HasłoMasło123");

        System.out.println("Correct password: " + PasswordValidator.validate(correct));
        System.out.println("Too short password: " + PasswordValidator.validate(tooShort));
        System.out.println("Password without digit: " + PasswordValidator.validate(withoutDigit));
        System.out.println("Password without special char: " + PasswordValidator.validate(withoutSpecialChar));
    }
}
