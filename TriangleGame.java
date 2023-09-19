package startproject;

import java.util.Scanner;

public class TriangleGame {
	
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	if (a+b+c==180)
	{
		if(a==60 &&b==60&&c==60)
		{
			System.out.println("prize3");
		}
		else if(a==90 &&b==90&&c==90)
		{
			System.out.println("prize2");
		}
		else 
		{
				System.out.println("prize1");
		}
		
	}
	else 
	{
		System.out.println("no prize");
	}
	}
	
	}
