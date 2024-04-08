import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib ein neues Passwort ein:");
        String password = scanner.nextLine();
        scanner.close();

        if (password.length() <8 || password.length() >32) {
            System.out.println("Das Passwort muss zwischen 8 und 32 Zeichen lang sein!");
            return;
        }

        boolean hatGrossbuchstaben = false;
        boolean hatKleinbuchstaben = false;
        boolean hatZiffern = false;
        boolean hatSonderzeichen = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hatGrossbuchstaben = true;
            } else if (Character.isLowerCase(c)) {
                hatKleinbuchstaben = true;
            } else if (Character.isDigit(c)) {
                hatZiffern = true;
            } else if ((c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
                hatSonderzeichen = true;
            }
        }

        if (!hatGrossbuchstaben) {
            System.out.println("Das Passwort muss mindestens einen Großbuchstaben enthalten.");
        }
        if (!hatKleinbuchstaben) {
            System.out.println("Das Passwort muss mindestens einen Kleinbuchstaben enthalten.");
        }
        if (!hatZiffern) {
            System.out.println("Das Passwort muss mindestens eine Zahl enthalten.");
        }
        if (!hatSonderzeichen) {
            System.out.println("Das Passwort muss mindestens ein Sonderzeichen enthalten.");
        }
        if (hatGrossbuchstaben && hatKleinbuchstaben && hatZiffern && hatSonderzeichen) {
            System.out.println("Das Passwort ist sicher.");
        }
    }
}