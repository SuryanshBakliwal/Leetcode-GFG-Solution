class Solution {
    public int longestSubarray(int[] A) {
        int i=0, j,res=0,k=1;
        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (A[i] == 0) {
                    k++;
                }
                i++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    }
}