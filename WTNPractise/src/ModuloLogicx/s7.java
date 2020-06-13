package ModuloLogicx;
import java.util.Scanner;
public class s7 {
	public static void main(String args[])
	{
		int n,r,rev=0;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n/=10;
		}
		System.out.println(rev);
		while(rev!=0)
		{
			switch(rev%10)
			{
			case 1:System.out.print(" One");
			break;
			case 2:System.out.print(" Two");
			break;
			case 3:System.out.print(" Three");
			break;
			case 4:System.out.print(" Four");
			break;
			case 5:System.out.print(" Five");
			break;
			case 6:System.out.print(" Six");
			break;
			case 7:System.out.print(" Seven");
			break;
			case 8:System.out.print(" Eight");
			break;
			case 9:System.out.print(" Nine");
			break;
			}
			rev=rev/10;
		}
		
	}

}
