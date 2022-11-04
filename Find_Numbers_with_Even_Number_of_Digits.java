import java.util.*;
class a{
    public static int count(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c+=1;
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r,k=0;
        for(int i=0;i<n;i++){
          r=count(arr[i]);
          if(r%2==0){
              k+=1;
          }
        }
        System.out.println(k);
    }
}