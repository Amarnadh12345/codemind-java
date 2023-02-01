import java.util.*;
class a{
    public static void main(String args[]){
        int n;
        int c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++){
            if(arr[i-1]%2==0 && arr[i+1]%2==0){
                if(arr[i]%2==0)
                    c+=1;
            }
        }
        System.out.println(c);
    }
}