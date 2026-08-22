class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n,s=0,p=1;
        while(temp>0)
        {
            int d = temp%10;
            s = s+d;
            p = p*d;
            temp = temp/10;
        }

        if(n%(s+p)==0)
        {
            return true;
        }
        return false;
    }
}