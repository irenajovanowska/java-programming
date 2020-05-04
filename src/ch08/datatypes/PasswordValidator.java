package ch08.datatypes;
/* Validate the complexity of a proposed password
 * by assuring it meets these rules:
 * at least 8 characters
 * contains an uppercase letter
 * contains a special character
 * not contain the username
 * not the same as the old password
 */

import java.util.Scanner;

public class PasswordValidator {

    protected static String username;
    protected static String oldPassword;
    protected static String newPassword;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        //Prompt for the username, the old password and the new password
        System.out.println("Enter username:");
        username = scanner.next();

        System.out.println("Enter old password:");
        oldPassword = scanner.next();

        System.out.println("Enter new password:");
        newPassword = scanner.next();

        scanner.close();

        validatePassword();

        //boolean yes = containsUpperCase();
        //System.out.println(yes);
    }

    public static void validatePassword() {
        if(newPassword.length() >= 8 && hasUpper() && hasSpecial() && !(newPassword.contains(username)) && !(newPassword.equals(oldPassword)))
            System.out.println("You've successfully set your password!");
        else
            System.out.println("The password you entered doesn't meet the safety criteria. Please enter a new one.");
    }

    public static boolean hasUpper() {
        for(int i = 0; i < newPassword.length(); i++) {
            if(Character.isUpperCase(newPassword.charAt(i)))
                break;
        }
        return true;
    }

    public static boolean hasSpecial() {
        String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}";
        for(int i = 0; i < newPassword.length(); i++) {
            if(specialCharacters.contains(Character.toString(newPassword.charAt(i))))
                break;
        }
        return true;
    }
}
