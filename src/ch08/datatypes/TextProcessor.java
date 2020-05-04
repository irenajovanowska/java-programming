package ch08.datatypes;
/* Count the number of words in a string
 * and print them individually on a new line
 */

public class TextProcessor {
    public static void main(String args[]) {
        //countWords("I love Test Automation University");
        //reverseString("irena");
        addSpaces("JavaProgrammingCourse");
    }

    /**
     * Add spaces before each capital letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {
        //A new instantiation of the StingBuilder class
        var modifiedText = new StringBuilder(text);

        for(int i = 0; i < modifiedText.length(); i++) {
            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    /**
     * Prints a sting in reverse order
     * @param word String to reverse
     */
    public static void reverseString(String word) {
        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    /**
     * Splits astring into an array by tokenizing it
     * Counts words and prints them
     * @param text Full string
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words.", numberOfWords);
        System.out.println(message);

        for(int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }
}
