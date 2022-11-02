import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    c+=1;
                }
            }
            res[i]=c;
            c=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}