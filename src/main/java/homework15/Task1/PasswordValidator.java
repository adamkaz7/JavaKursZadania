package homework15.Task1;

import java.lang.reflect.Field;

public class PasswordValidator {
    public static boolean validate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(PasswordValidation.class)) {
                PasswordValidation annotation = field.getAnnotation(PasswordValidation.class);
                field.setAccessible(true);
                try {
                    String password = (String) field.get(obj);
                    if (password.length() < annotation.minLength()) {
                        return false;
                    }
                    if (annotation.requireDigit() && !hasDigit(password)) {
                        return false;
                    }
                    if (annotation.requireSpecialChar() && !hasSpecialChar(password)) {
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Password Validation Error");
                    return false;
                }

            }
        }
        return true;
    }

    private static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasSpecialChar(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
