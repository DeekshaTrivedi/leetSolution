
        class Solution {
    public int minimumOneBitOperations(int n) {
        return dfs(n);
    }

    private int dfs(int n) {
        if (n == 0) return 0;

        int k = 31 - Integer.numberOfLeadingZeros(n); 
        int mask = 1 << k;

        return (1 << (k + 1)) - 1 - dfs(n ^ mask);

    }
}