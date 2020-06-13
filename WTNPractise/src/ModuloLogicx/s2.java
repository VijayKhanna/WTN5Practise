package ModuloLogicx;
import java.util.Scanner;
public class s2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,r,c=0;
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			c+=r;
			n/=10;
		}
		System.out.println("Sum Of Digits "+c);
	}
}
