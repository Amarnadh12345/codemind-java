import java.util.*;
    class a{
        public static int maximum69Number (int num) {
        return Integer.valueOf(String.valueOf(num).replaceFirst("6","9")).intValue();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rem=maximum69Number(num);
        System.out.println(rem);
    }
}