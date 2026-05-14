package homework9;

class Task1 {
    public static void main(String[] args) {
        try {
            PasswordValidator.validate("password");
            System.out.println("Password Correct");
        } catch (IllegalArgumentException exception) {
            System.out.println("Password incorrect: " + exception.getMessage());
        }
    }
}
