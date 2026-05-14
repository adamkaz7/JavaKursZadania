package homework9;

class PasswordValidator {
    public static void validate(String pwd) {
        if (pwd == null || pwd.length() < 8) {
            throw new IllegalArgumentException("Password cannot be null and needs at least 8 characters");
        }
        boolean hasDigit = false;
        for (int index = 0; index < pwd.length(); index++) {
            if (Character.isDigit(pwd.charAt(index))) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password needs at least one digit");
        }
    }
}
