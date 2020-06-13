package ModuloLogicx;
import java.util.Scanner;
public class s6 {
	public static void main(String args[])
	{
		int n,d,r,c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		d=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			if(r==d)
			{
				c++;
			}
			n=n/10;
		}
		System.out.println(c);
	}
}
