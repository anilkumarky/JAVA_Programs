package startproject;
import java.util.Scanner;
public class Ex1 {
	static String angry(int k,int a[])
	{
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=0)
			{
				count++;
			}
		}if(count >=k)
		{
			return "no";
		}
		else
		{
			return "yes";
		}
		
	}

	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		int n= sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(angry(k,a));
		
}
}
