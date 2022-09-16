import java.util.*;
class a{
    public static void main(String args[]){
        int n,len,c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        String str= Integer.toString(n);  
        len=str.length();
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(str.charAt(i)==str.charAt(j)){
                    c=1;
                    break;
                }
            }
        }
        if(c==0){
            System.out.println("Unique Number");
        }
        else{
            System.out.println("Not Unique Number");
        }
    }
}