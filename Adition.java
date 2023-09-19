package startproject;

public class Adition {
	int add(int x,int y)
	{
		
		int c=x+y;
		return c;
		
	}

	public static void main(String[] args) {
		Adition a= new Adition();
		int res,b,c;
		b=50;
		c=40;
		res=a.add(b,c);
		System.out.println(res);
		

	}

}
