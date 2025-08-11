class Solution {
    public int romanToInt(String s) {
        int[] vals = new int[26];
        vals['I' - 'A'] = 1;
        vals['V' - 'A'] = 5;
        vals['X' - 'A'] = 10;
        vals['L' - 'A'] = 50;
        vals['C' - 'A'] = 100;
        vals['D' - 'A'] = 500;
        vals['M' - 'A'] = 1000;

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = vals[s.charAt(i) - 'A'];
            if (i + 1 < s.length() && value < vals[s.charAt(i + 1) - 'A']) {
                total -= value;
            } else {
                total += value;
            }
        }
        return total;
        
    }
}