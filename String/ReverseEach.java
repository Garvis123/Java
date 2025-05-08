package String;

public class ReverseEach {
    // input - i am an educator 
    // output i ma na rotacude
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        s = s.trim(); // remove leading/trailing spaces
        boolean spacePending = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
                spacePending = true;
            } else if (spacePending) {
                sb.reverse();
                ans.append(sb).append(' ');
                sb.setLength(0); // reset
                spacePending = false;
            }
            // If it's a space and spacePending is false => skip extra space
        }

        // Add the last word
        if (sb.length() > 0) {
            sb.reverse();
            ans.append(sb);
        }

        // Now reverse the entire string to get the words in reverse order
        return ans.reverse().toString();
    }
}
