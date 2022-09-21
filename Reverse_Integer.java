import java.util.*;
class a{
    public static void main(String args[]){
       int rem=0,res=0,n;
       Scanner sc = new Scanner(System.in);
       n=sc.nextInt();
       if(n<0){
           n=Math.abs(n);
         while (n>0)
        {
          rem=n%10;
          res=res*10+rem;
          n=n/10;
        }
        System.out.println("-"+res);  
       }
       else{
            while (n>0)
            {
              rem=n%10;
              res=res*10+rem;
              n=n/10;
            }
            System.out.println(res);
       }
    }
}