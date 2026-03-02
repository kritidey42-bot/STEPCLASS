/**
 * OOPSBannerApp - UC7
 * Displays "OOPS" banner using CharacterPattern class
 * for better abstraction and scalability.
 *
 * @author Kriti
 * @version 7.0
 */
public class UC7 {

    public static void main(String[] args) {

        CharacterPatternMap patternMap = new CharacterPatternMap();

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPattern pattern = patternMap.getPattern(ch);
                lineBuilder.append(pattern.getLine(row)).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }

    // Static Inner Class to store character & its pattern
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String getLine(int index) {
            return pattern[index];
        }
    }

    // Static Inner Class acting as Pattern Map
    static class CharacterPatternMap {

        private CharacterPattern oPattern;
        private CharacterPattern pPattern;
        private CharacterPattern sPattern;

        public CharacterPatternMap() {

            oPattern = new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            });

            pPattern = new CharacterPattern('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            });

            sPattern = new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            });
        }

        public CharacterPattern getPattern(char ch) {

            switch (ch) {
                case 'O':
                    return oPattern;
                case 'P':
                    return pPattern;
                case 'S':
                    return sPattern;
                default:
                    throw new IllegalArgumentException("Character not supported: " + ch);
            }
        }
    }
}