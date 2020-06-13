package ModuloLogicx;
import java.util.Scanner;
public class s3 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,r,c=0;
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			c=(c*10)+r;
			n/=10;
		}
		System.out.println("Rev "+c);
	}
}
