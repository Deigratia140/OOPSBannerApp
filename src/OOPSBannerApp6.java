public class OOPSBannerApp6 {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Combine letters row by row
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ", o[i], o[i], p[i], s[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method for letter O
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

    // Static method for letter P
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

    // Static method for letter S
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