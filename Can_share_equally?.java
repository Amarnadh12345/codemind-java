import java.util.*;
class a{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int r1,r2;
    r1=sc.nextInt();
    r2=sc.nextInt();
    if(r1%2==0&&(r1>0 || r2%2==0)){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }
}