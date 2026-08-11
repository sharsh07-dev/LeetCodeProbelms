class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        long max = 0;
        for (int num : piles) {
            max = Math.max(num, max);
        }
        long low = 1; // use long instead of int to avoid overflow
        long high = max;
        while (low <= high) {

            long mid = low + (high - low) / 2;
            if (getHours(piles, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return (int) low;
    }

    public long getHours(int[] piles, long h) {
        long totalHrs = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHrs += (int) Math.ceil((double) piles[i] / h);
        }
        return totalHrs;
    }
}
