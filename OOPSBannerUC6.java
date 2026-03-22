public class OOPSBannerUC6 {

    // Method to build 'O'
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

    // Method to build 'P'
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

    // Method to build 'S'
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

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Build banner using method outputs
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", O[i], O[i], P[i], S[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}