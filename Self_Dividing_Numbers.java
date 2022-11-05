import java.util.*;
class a{
    public static boolean sum(int n){
        int d=0,c=0,num=n;
        int k=(int)Math.log10(n)+1;
        while(n>0)
        {
            d=n%10;
            n=n/10;
            if (d!=0)
            {
                if(num%d==0)
                {
                    c+=1;
                }
            }
        }
        if(k==c){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=s;i<=e;i++){
            if(sum(i)){
                 System.out.print(i+" ");
            }
        }
    }
}