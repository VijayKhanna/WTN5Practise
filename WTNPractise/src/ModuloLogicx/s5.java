package ModuloLogicx;
import java.util.Scanner;
public class s5 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num,n,sum=0;
		num=sc.nextInt();
		n=num;
		while(n>0)  
	    {  
	    n=num%10;  
	    num=num/10;  
	    sum=sum+(n*n*n);  
	    }  
		System.out.println(sum);
	}

}
