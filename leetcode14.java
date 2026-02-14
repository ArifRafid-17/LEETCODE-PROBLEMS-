public class leetcode14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String result = "";

        // Loop through characters of first string
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            // Compare with same index of all other strings
            for (int j = 1; j < strs.length; j++) {
                // If index out of range or mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return result;
                }
            }

            // If matched in all strings
            result += currentChar;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs)); // Output: "a"
    }
}
