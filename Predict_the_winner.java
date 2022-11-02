import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=0,y=0;
        for(int i=0;i<n;i=i+2){
           x+=arr[i]; 
        }
        for(int j=1;j<n;j=j+2){
            y+=arr[j];
        }
       int c=Math.abs(x-y);
        if(c%4==0){
            System.out.println('X');
        }
        else{
            System.out.println('Y');
        }
    }
}