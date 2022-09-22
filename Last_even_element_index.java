import java.util.*;
class a{
    public static void main(String args[]){
        int n,k=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2==0){
                k=i;
                break;
            }
        }
        System.out.println(k);
    }
}