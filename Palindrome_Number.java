import java.util.*;
class palindromenumber
{
    public static int rev(int n)
    {
      int  rem=0,res=0;
       while(n>0){
           rem=n%10;
           res=res*10+rem;
           n=n/10;
       }
       return res;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,num;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int revnum=0;
            num=sc.nextInt();
            revnum=rev(num);
            if (num==revnum)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
        }
        
    }
}