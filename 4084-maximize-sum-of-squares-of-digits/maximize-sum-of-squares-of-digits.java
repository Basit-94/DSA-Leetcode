class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum) {
            return "";
        }

        StringBuilder s = new StringBuilder("");
        int m = 9;
        for(int i=0;i<num;i++) {
            if(sum<=9) {
                m = sum;
            }
            else if(sum>9) {
                m = 9;
            }
            
            s.append(m);
            sum = sum-m;
        }

        return s.toString();
    }
}