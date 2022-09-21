import java.util.*;
class a{
    public static void main(String args[]){
        int n,sq,l,d;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        d=(int)Math.log10(n)+1;
        l=sq%(int)Math.pow(10,d);
        if(l==n)
            System.out.println("Automorphic Number");
		else
			System.out.println("Not an Automorphic Number");	
    }
}