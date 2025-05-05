package String;

public class Palidrome {
    public static boolean Palidromee(String name) {
        // Convert to lowercase and remove non-alphanumeric characters
        name = name.toLowerCase().replaceAll("[^a-z0-9]", "");

        int n = name.length();
        for (int i = 0; i < n / 2; i++) {
            if (name.charAt(i) != name.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String name = "0A man, a plan, a canal: Panama0";
        System.out.print(Palidromee(name));  // Should print true
    }
}
