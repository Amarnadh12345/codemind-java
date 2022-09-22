import java.util.*;
class a
{
    public static void main(String args[])
    {
        int n,c=0,k;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}