class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum) {
            return "";
        }

        StringBuilder s = new StringBuilder("");
        int m = 9;
        for(int i=0;i<num;i++) {
            m = Math.min(sum,9);
            
            s.append(m);
            sum = sum-m;
        }

        return s.toString();
    }
}