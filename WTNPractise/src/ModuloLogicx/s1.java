package ModuloLogicx;
import java.util.Scanner;
public class s1 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int n,r,c=0;
	n=sc.nextInt();
	while(n!=0)
	{
		r=n%10;
		c+=1;
		n/=10;
	}
	System.out.println("No Of Digits "+c);
}
}
