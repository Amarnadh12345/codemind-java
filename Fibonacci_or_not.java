import java.util.*;
class a{
    public static boolean fibinocci(int n){
        int a=0,b=1;
        if(n==a || n==b)return true;
        int c=a+b;
        while(c<=n){
            if(c==n)return true;
            a=b;
            b=c;
            c=a+b;
        }
        return false;
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(fibinocci(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}