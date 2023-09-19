package startproject;

import java.util.Scanner;
public class DiscountCalculator {

	 static void DisCal(int i,int s,int t,int n) 
	{
		float d1=0.0f;
		float d2=0.0f;
		d1=(i*(7.0f/100))+(s*(3.0f/100))+(t*(2.0f/100)+(n*(1.0f/100)));
		System.out.println(d1);
		float total=i+s+t+n;
		
		if(total >= 25001 ||total <=50000)
		{
			d2=total*(5.0f/100);
		}
		else if(total >= 50001 ||total <=100000)
		{
			d2=total*(7.0f/100);
		}
		else
		{
			d2=total*(10.0f/100);
		}
		System.out.println(d2);
		if(d1>d2)
		{
			System.out.println(d1);
		}
		else
		{
			System.out.println(d2);
		}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("hi");
		int i=scan.nextInt();
		System.out.println("hi");
		int s=scan.nextInt();
		System.out.println("hi");
		int t=scan.nextInt();
		System.out.println("helo");
		int n=scan.nextInt();
		 DisCal(i,s,t,n);

	
}}
