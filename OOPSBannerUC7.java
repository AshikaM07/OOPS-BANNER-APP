/**
 * OOPS Banner App - UC7
 * Demonstrates use of Inner Static Class to store character patterns
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to encapsulate character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character to store
         * @param pattern 7-line pattern of the character
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods to create patterns
    static String[] getOPattern() {
        return new String[]{
            " ***   ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            " ***   "
        };
    }

    static String[] getPPattern() {
        return new String[]{
            " ****  ",
            "*   *  ",
            "*   *  ",
            " ****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        // Array of objects (Encapsulation)
        CharacterPattern[] patterns = {
            new CharacterPattern('O', getOPattern()),
            new CharacterPattern('P', getPPattern()),
            new CharacterPattern('S', getSPattern())
        };

        // Build "OOPS"
        StringBuilder[] banner = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        // Construct banner line by line
        for (int i = 0; i < 7; i++) {
            for (CharacterPattern cp : patterns) {
                if (cp.getCharacter() == 'O') {
                    // O appears twice
                    banner[i].append(cp.getPattern()[i]).append(" ");
                    banner[i].append(cp.getPattern()[i]).append(" ");
                } else {
                    banner[i].append(cp.getPattern()[i]).append(" ");
                }
            }
        }

        // Print banner
        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}