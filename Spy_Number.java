import java.util.*;
class a{
    public static int sum(int n){
       int sum=0,d=0;
        while(n>0){
            d=n%10;
            n=n/10;
            sum+=d;
            d=0;
        }
        return sum;
    }
     public static int pro(int n){
       int sum=1,d=0;
        while(n>0){
            d=n%10;
            n=n/10;
            sum=sum*d;
            d=0;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r= sum(n);
        int p= pro(n);
        if(r==p){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}