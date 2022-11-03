import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0,m=0,k=0;
        for(int i=0;i<n;i++){
            m+=c;
            c=0;
            if(arr[i]!=-999){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        c+=1;
                        arr[j]=-999;
                    }
                }
                if(c%2!=0){
                    c=c/2+1;}
                else{
                    c=c/2;}
            }
        }
        k+=m;
        System.out.print(k+" ");
    }
}