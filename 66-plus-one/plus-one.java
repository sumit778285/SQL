class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry, return early
            }
            digits[i] = 0; // carry over
        }

        // If all digits were 9, we need an extra digit at the start
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}