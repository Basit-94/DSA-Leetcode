class Solution {
    public int getSum(int a, int b) {
        int carry=0,c=0,sum=0,result=0;
        for(int i=0;i<32;i++)
        {
            carry=0;
            result = result | (carry<<i);
            int x = ((a>>i)&1);
            int y = ((b>>i)&1);
            if(x==1 && y==1)
            {
                if(c==0)
                {
                    carry = 1;
                    sum = 0;
                }
                else
                {
                    carry = 1;
                    sum = 1;
                }
            }
            else if(x==0 && y==0)
            {
                if(c==0)
                {
                    carry = 0;
                    sum = 0;
                }
                else
                {
                    carry = 0;
                    sum = 1;
                }
            }
            else
            {
                if(c==0)
                {
                    carry = 0;
                    sum = 1;
                }
                else
                {
                    carry = 1;
                    sum = 0;
                }
            }

            result = result | (sum<<i);
            c = carry;
        }

        return result;
    }
}