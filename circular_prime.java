import java.util.*;
class a{
    public static boolean isprime(int n){
        if(n==1)
            return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static int rev(int n){
        
        int d,s=0,l,p;
        l=(int)Math.log10(n);
        int i=0;
        while (n>0)
        {
            d=n%10;
            n=n/10;
            if (l>0)
            {
                p=(int)Math.pow(10,l);
                d=d*p;
            }
            s+=d;
            l--;
            i++;
        }
        return s;
    }
    public static void main(String args[]){
        int n,r;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(isprime(n)){
            r=rev(n);
            if(isprime(r)){
                System.out.println("circular prime");
            }
            else{
                System.out.println("prime but not a circular prime");
            }
        }
        else{
            System.out.println("not prime");
        }
    }
}