import java.util.*;
class a{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n-1;j++){
             if(arr[j]<arr[j+1]){
                System.out.println("no");
                System.exit(0);
             }   
            }
        System.out.println("yes");    
    }
}