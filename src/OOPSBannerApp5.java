public class OOPSBannerApp5 {

    public static void main(String[] args) {

        // Array declaration + initialization in single statement
        String[] banner = {
            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*     "),
            String.join("  ", "*     *", "*     *", "*     *", "*     "),
            String.join("  ", "*     *", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     ", "*     ", "      *"),
            String.join("  ", "*     *", "*     ", "*     ", "      *"),
            String.join("  ", " ***** ", "*     ", " ***** ", " ***** ")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}