import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    /**
     * Builds and returns the character pattern map
     */
    static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***   ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            "*   *  ",
            " ***   "
        });

        map.put('P', new String[]{
            " ****  ",
            "*   *  ",
            "*   *  ",
            " ****  ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        return map;
    }

    /**
     * Renders banner for a given word
     */
    static void renderBanner(String word, Map<Character, String[]> map) {

        StringBuilder[] banner = new StringBuilder[7];

        // initialize rows
        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        // build banner row by row
        for (int i = 0; i < 7; i++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    banner[i].append(pattern[i]).append(" ");
                }
            }
        }

        // print banner
        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        // Render OOPS
        renderBanner("OOPS", patternMap);
    }
}