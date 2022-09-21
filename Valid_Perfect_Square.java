import java.util.*;
class perfectcube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,n2,t;
		double n1;
		t=sc.nextInt();
		for(int i=1;i<=t;i++){
		n=sc.nextInt();
		n1=Math.sqrt(n);
		n2=(int)n1;
		if (n1-n2>0)
		    System.out.println("False");
		else
		    System.out.println("True");
		}
	}
}