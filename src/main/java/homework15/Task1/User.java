package homework15.Task1;

public record User(
        @PasswordValidation(minLength = 10, requireDigit = true, requireSpecialChar = true) String password) {
}
