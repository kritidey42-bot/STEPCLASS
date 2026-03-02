/**
 * OOPSBannerApp - UC6
 * Displays "OOPS" banner using static helper methods
 * for better modularity and reusability.
 *
 * @author Kriti
 * @version 6.0
 */
public class UC6 {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Combine letters row by row
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    // Static method to build letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method to build letter P
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method to build letter S
    public static String[] buildS() {
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
}