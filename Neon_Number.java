import java.util.*;
class a{
    public static int sum(int n){
        int d=0,sum=0;
        while(n>0){
            d=n%10;
            n=n/10;
            sum+=d;
            d=0;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int r=sum(sq);
        if(n==r){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}