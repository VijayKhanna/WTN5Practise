package Basicx;
import java.util.Scanner;
public class s3 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,sum=0,sq;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sq=i*i;
			sum+=sq;
		}
		System.out.println("Sum of squares of n natural numbers: "+sum);
	}
}
