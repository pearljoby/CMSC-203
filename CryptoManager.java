
/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek 
 * Description: Checks if the text is in bounds, and the crypto manager test students has the test cases
 * Due: 03/04/23
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Pearl Joby
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 *
 * @author Pearl Joby
 * @version 3/4/2024
 */
public class CryptoManager {

    private static final char LOWER_RANGE = ' ';
    private static final char UPPER_RANGE = '_';  // Change from '-' to '_'
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) > UPPER_RANGE || plainText.charAt(i) < LOWER_RANGE) {
                return false;
            }
        }
        return true;
    }

    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "Text is not in bounds.";
        }

        char[] textArray = new char[plainText.length()];

        for (int i = 0; i < plainText.length(); i++) {
            textArray[i] = (char) (plainText.charAt(i) + key);

            while (textArray[i] > UPPER_RANGE) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }

            while (textArray[i] < LOWER_RANGE) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }

        return String.valueOf(textArray);
    }

    public static String bellasoEncryption(String plainText, String bellasoStr) {
        if (!isStringInBounds(plainText)) {
            return "Text is not in bounds.";
        }

        char[] keyArray = new char[plainText.length()];
        int length = 0;

        while (length < plainText.length()) {
            keyArray[length] = bellasoStr.charAt(length % bellasoStr.length());
            length++;
        }

        char[] textArray = new char[plainText.length()];

        for (int i = 0; i < plainText.length(); i++) {
            textArray[i] = (char) (plainText.charAt(i) + keyArray[i]);

            while (textArray[i] > UPPER_RANGE) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }

            while (textArray[i] < LOWER_RANGE) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }

        return String.valueOf(textArray);
    }

    public static String caesarDecryption(String encryptedText, int key) {
        if (!isStringInBounds(encryptedText)) {
            return "Text is not in bounds.";
        }

        char[] textArray = new char[encryptedText.length()];

        for (int i = 0; i < encryptedText.length(); i++) {
            textArray[i] = (char) (encryptedText.charAt(i) - key);

            while (textArray[i] > UPPER_RANGE) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }

            while (textArray[i] < LOWER_RANGE) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }

        return String.valueOf(textArray);
    }

    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        if (!isStringInBounds(encryptedText)) {
            return "Text is not in bounds.";
        }

        char[] keyArray = new char[encryptedText.length()];
        int length = 0;

        while (length < encryptedText.length()) {
            keyArray[length] = bellasoStr.charAt(length % bellasoStr.length());
            length++;
        }

        char[] textArray = new char[encryptedText.length()];

        for (int i = 0; i < encryptedText.length(); i++) {
            textArray[i] = (char) (encryptedText.charAt(i) - keyArray[i]);

            while (textArray[i] > UPPER_RANGE) {
                textArray[i] = (char) (textArray[i] - RANGE);
            }

            while (textArray[i] < LOWER_RANGE) {
                textArray[i] = (char) (textArray[i] + RANGE);
            }
        }

        return String.valueOf(textArray);
    }
}

