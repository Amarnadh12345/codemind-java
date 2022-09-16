import java.util.*;
class a{
    public static void main(String args[]){
        int n1,n2,s1=0,s2=0;
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=1;i<=n1/2;i++){
            if(n1%i==0){
                s1+=i;
            }
        }
        for(int j=1;j<=n2/2;j++){
            if(n2%j==0){
                s2+=j;
            }
        }
        if(n1==s2 && n2==s1){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}