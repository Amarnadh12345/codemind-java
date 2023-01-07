import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='u'||s.charAt(i)=='U'){
                c+=1;
            }
            else if(s.charAt(i)=='d'||s.charAt(i)=='D'){
                c+=-1;
            }
            else if(s.charAt(i)=='r'||s.charAt(i)=='R'){
                c+=1;
            }
            else if(s.charAt(i)=='l'||s.charAt(i)=='L'){
                c+=-1;
            }
        }
        if(c==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}