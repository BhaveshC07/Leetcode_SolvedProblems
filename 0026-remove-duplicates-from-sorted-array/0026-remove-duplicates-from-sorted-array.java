class Solution {
    public int removeDuplicates(int[] A) {
        int i=0;
        int N = A.length;
        for(int j=1; j < N; j++) {
            if(A[i] != A[j]) {
                i++;
                A[i] = A[j];
            }
        }
        return i+1;
    }
}