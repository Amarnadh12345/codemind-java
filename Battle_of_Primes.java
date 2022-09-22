import java.util.*;
class a{
    public static void main(String args[]){
        int d1,d2,d3,s;
        Scanner sc = new Scanner(System.in);
        d1=sc.nextInt();
        d2=sc.nextInt();
        d3=d1+d2;
        s=d3;
        for(int i=1;i<=s;i++){
            s+=1;
            int k=0;
            for(int j=1;j<=s/2;j++){
                if(s%j==0){
                    k+=1;
                }
            }
            if(k==1){
                System.out.println(s-d3);
                break;
            }
        }
    }
}