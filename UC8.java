import java.util.*;

public class UC8 {

    // Function to print banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int rows = map.get(word.charAt(0)).length;

        for (int i = 0; i < rows; i++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = map.get(ch);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        renderBanner(word, map);
    }
}