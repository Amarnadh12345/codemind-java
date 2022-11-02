import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int m=0;
        for(int i=0;i<n;i++)
        {
            int c=1;
            if (arr[i]!=-999)
            {
                for(int j=0;j<n;j++)
                {
                    if (arr[i]==arr[j] && i!=j)
                    {
                        c+=1;
                        arr[j]=-999;
                    }
                }
                if (c==1)
                {
                    if (arr[i]>=m)
                    {
                        m=arr[i];
                    }
                }
            }
        }
        if (m!=0)
            System.out.println(m);
        else
            System.out.println(-1);
    }
}