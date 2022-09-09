import java.util.*;
class a{
    public static void main(String args[]){
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j:arr){
            sum+=j;
        }
        System.out.println(sum);
    }
}