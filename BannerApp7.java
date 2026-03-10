public class BannerApp7 {

   
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character Character to display
         * @param pattern 7 line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
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

    /**
     * Utility method to get pattern for a character
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7];
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

                new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),

                new CharacterPatternMap('P', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        "*      ",
                        "*      ",
                        "*      "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                })
        };

        String word = "OOPS";

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = getCharacterPattern(patterns, ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append("  ");
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(banner[i]);
        }
    }
}