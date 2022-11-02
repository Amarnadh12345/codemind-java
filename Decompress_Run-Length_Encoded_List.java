import java.util.*;
import java.util.Arrays;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int  i=0;i<n;i++){
           nums[i]=sc.nextInt(); 
        }
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
         for(int i=0;i<arrSize;i++){
             System.out.print(result[i]+" ");
         }
}
}