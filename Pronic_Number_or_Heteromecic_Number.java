import java.util.*;
class pronic{
    public static void main(String args[]){
    int n,h=0;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(i*(i+1)==n){
            h+=1;
            System.out.println("YES");
            break;
        }
    }
    if(h==0){
        System.out.println("NO");
    }
    }
}