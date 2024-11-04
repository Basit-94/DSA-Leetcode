import java.util.*;
class Solution {     
 public String compressedString(String word) { 
     Scanner in = new Scanner(System.in);     
     int l,i,f,h;
      l=i=f=h=0;
      String comp,e;char c,c1,c2;
      comp="";      
      c=c1=c2='\u0000';
      l = word.length();
      c2=word.charAt(0);
      for(i=0;i<l;i++)
      {
         if(f<9)
         {
         c1 = word.charAt(i);
         if(c1!=c2)
         {
            comp = comp+""+f+c2;
            f = 0;
            i=i-1;
         }
         if(c1==c2)
         {
            f++;
            c2=' ';
         }    
         c2 = c1;        
         }
         if(f>8)
         {
            comp = comp+""+f+c2;
            if((i+1)<l)
            {
            c2=word.charAt(i+1);
            }
            if((i+1)>=l)
            {
                h++;
            }
            f=0;
         }
      }
      comp = comp+""+f+c2;
      e = comp;
      if(h!=0)
      {
        e = comp.substring(0,comp.length()-2);
      }
      return e;
    }
}
