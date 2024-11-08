class Solution {
    public int romanToInt(String s) {
        int l,i,sum,k;
        l=i=sum=k=0;char c,c1;
        s = s+" "+"p";
        l = s.length();
        for(i=0;i<l;i++)
        {
            c = s.charAt(i);
            c1 = s.charAt(i+1);
            if(c1!='p')
            {
                if(c=='M')
                {
                    k = 1000; 
                }
                if(c=='D')
                {
                    k = 500;
                }
                if(c=='C')
                {
                    k = 100;
                    if(c1=='M')
                    {
                        k = 900;
                        i = i+1;
                    }
                    if(c1=='D')
                    {
                        k = 400;
                        i = i+1;
                    }
                }
                if(c=='L')
                {
                    k = 50;
                    if(c1=='D')
                    {
                        k = 450;
                        i = i+1;
                    }
                    if(c1=='M')
                    {
                        k = 950;
                        i = i+1;
                    }
                }
                if(c=='X')
                {
                    k = 10;
                    if(c1=='L')
                    {
                        k = 40;
                        i = i+1;
                    }
                    if(c1=='C')
                    {
                        k = 90;
                        i = i+1;
                    }
                    if(c1=='D')
                    {
                        k = 490;
                        i = i+1;
                    }
                    if(c1=='M')
                    {
                        k = 990;
                        i = i+1;
                    }
                }
                if(c=='V')
                {
                    k = 5;
                    if(c1=='L')
                    {
                        k = 45;
                        i = i+1;
                    }
                    if(c1=='C')
                    {
                        k = 95;
                        i = i+1;
                    }
                    if(c1=='D')
                    {
                        k = 495;
                        i = i+1;
                    }
                    if(c1=='M')
                    {
                        k = 995;
                        i = i+1;
                    }
                }
                if(c=='I')
                {
                    k = 1;
                    if(c1=='V')
                    {
                        k = 4;
                        i = i+1;
                    }
                    if(c1=='X')
                    {
                        k = 9;
                        i = i+1;
                    }
                    if(c1=='L')
                    {
                        k = 49;
                        i = i+1;
                    }
                    if(c1=='C')
                    {
                        k = 99;
                        i = i+1;
                    }
                    if(c1=='D')
                    {
                        k = 499;
                        i = i+1;
                    }
                    if(c1=='M')
                    {
                        k = 999;
                        i = i+1;
                    }
                }
                sum = sum+k;
            }
            if(c1=='p')
            {
                break;
            }
        }
        return sum;             
    }
}
