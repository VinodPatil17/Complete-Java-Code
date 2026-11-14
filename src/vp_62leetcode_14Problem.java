public class vp_62leetcode_14Problem {
    public static String sigma(String[] strs) {
        String newString = "";

        for (int idx = 0; idx < strs[0].length(); idx++) {
            char currChar = strs[0].charAt(idx);

            for (int i = 1; i < strs.length; i++) {
                if (idx >= strs[i].length() ||
                        strs[i].charAt(idx) != currChar) {
                    return newString;
                }
            }

            newString = newString + currChar;
        }

        return newString;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "fligth"};

        System.out.println(sigma(strs));
    }
}