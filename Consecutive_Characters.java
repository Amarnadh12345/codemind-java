import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c=1;
        String st=sc.nextLine();
        int n=st.length();
        for(int i=0;i<=st.length();i++){
            int cur_count=1;
            for(int j=i+1;j<n;j++){
                if(st.charAt(j)!=st.charAt(i)){
                    break;
                }
                cur_count+=1;
                if(cur_count>c){
                    c=cur_count;
                }
            }
        }
        System.out.println(c);
        
    }
}