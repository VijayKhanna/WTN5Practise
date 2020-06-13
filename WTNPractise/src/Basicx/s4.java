package Basicx;

import java.util.Scanner;

public class s4 {
	public static void main(String args[])
	{
	int n;
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	int sum=0;
	sum=((n*(n+1)*((2*n)+1))/6);
	System.out.println(sum);
}
}