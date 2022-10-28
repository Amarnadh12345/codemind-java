import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String l=sc.nextLine();
        int c=1;
        int length = l.length();
        for(int i=0;i<length;i++){
            if(l.charAt(i)==' '){
                c+=1;
            }
        }
        System.out.println(c);
    }
}