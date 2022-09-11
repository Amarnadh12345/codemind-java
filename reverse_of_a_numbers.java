import java.util.*;
class a{
    public static void main(String args[]){
        int n,rem=0,sum=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=(int)Math.log10(n)+1;i>=1;i--){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}