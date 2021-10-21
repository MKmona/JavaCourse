package chapter8;

public class TextProcessor {

    public static void main(String args[]) {
       countWords("I love Test Automation University");

       reverseString("Hello TAU!");

       addSpaces("HeyWorld!It'sMeMona.");

    }

    /**
     * Splits a string into an array by tokening it.
     * Counts words and prints them
     *
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" "); //words is an array of Strings. The space is a delimiter to split the text.
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words.", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }

    }

    /**
     * Prints a String in reverse order
     *
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) { //we want to start looping from the last element
            System.out.print(text.charAt(i));
        }

    }

    /**
     * Adds spaces before each uppercase letter
     *
     * @param text jumbled text
     */
    public static void addSpaces(String text) {

        var modifiedText = new StringBuilder(text); //create an object of the StringBuilder class

        for (int i = 0; i < modifiedText.length(); i++) { //"if i is not equal to zero”, meaning this is not the first letter of the String because we don't want to add a leading space to the beginning of the String.
            if (i != 0 && Character.isUpperCase((modifiedText.charAt(i)))) {
                modifiedText.insert(i, " ");   //This will take a position, so, the position is i (wherever we are right now), and insert a space.
                i++; //I want to increment i so that we move past the space that we've just entered and on to the character, which then once it comes back here, will go on to the next character.
            }
        }
        System.out.println(modifiedText);
    }
}
