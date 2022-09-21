import java.util.*;
class a{
    public static int fact(int n){
        int mul=1;
        for(int i=n;i>0;i--){
            mul=mul*i;
        }
        return mul;
    }
    public static int digit(int n){
        int rem=0,res=0,sum=0;
        while(n>0){
            rem=n%10;
            sum+=fact(rem);
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        int n,r;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        r=digit(n);
        if(n==r){
            System.out.println("The number"+" "+n+" "+"is a strong number");
        }
        else{
            System.out.println("The number"+" "+n+" "+"is not a strong number");
        }
    }
}