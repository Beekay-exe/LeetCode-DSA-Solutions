public class LargestOddnumberinString {
    public String largestOddNumber(String num) {
        int n = num.length();

        // Traverse from right to left to find the last odd digit
        for (int i = n - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) { // Check if the digit is odd
                return num.substring(0, i + 1); // Return substring including the last odd digit
            }
        }

        return ""; // No odd number found
    }
}
