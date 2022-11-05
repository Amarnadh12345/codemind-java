import java.util.*;
class a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble(); 
        double rate =sc.nextDouble();
        double time = sc.nextDouble();
  
       
        double CI = principle *
                    (Math.pow((1 + rate / 100), time));
          
        System.out.printf("%.2f", CI);
    }

}