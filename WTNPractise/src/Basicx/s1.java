package Basicx;
import java.util.Scanner;
public class s1 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,sum=0;
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of n natural numbers: "+sum);
	}

}
