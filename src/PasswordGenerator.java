import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Scanner für die Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Eingabe der gewünschten Passwortlänge
        System.out.print("Geben Sie die gewünschte Passwortlänge ein: ");
        int length = scanner.nextInt();

        // Methode zum Generieren des Passworts aufrufen
        String password = generatePassword(length);

        // Passwort ausgeben
        System.out.println("Ihr generiertes Passwort ist: " + password);

        // Scanner schließen
        scanner.close();
    }

    // Methode zum Generieren des Passworts
    public static String generatePassword(int length) {
        // Alle möglichen Zeichen, die im Passwort vorkommen können
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-.?";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Passwort generieren
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
