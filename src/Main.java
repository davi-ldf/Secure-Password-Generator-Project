import java.security.SecureRandom;

public class Main {

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";

    public static String generatePassword(int length) {
        SecureRandom randomNumberGenerator = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = randomNumberGenerator.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12;
        String password = generatePassword(passwordLength);
        System.out.println("Password generated: " + password);
    }
}