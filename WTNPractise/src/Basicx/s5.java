package Basicx;
import java.util.Scanner;
public class s5 
{
	public static void main(String args[])
	{
	int n;
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	int sum=0,cu;
	for(int i=1;i<=n;i++)
	{
		cu=i*i*i;
		sum+=cu;
	}
	System.out.println(sum);

}
}