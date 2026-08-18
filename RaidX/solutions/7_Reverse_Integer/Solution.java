class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int n = Math.abs(x);
        if(x == Integer.MIN_VALUE) return 0 ;
        while (n != 0) {
            int lastInt = n % 10;

            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && lastInt > 7))
                return 0;

            reverse = reverse * 10 + lastInt;
            n = n / 10;
        }

        if (x < 0)
            return reverse * (-1);

        return reverse;
    }
}