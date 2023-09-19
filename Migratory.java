package startproject;

public class Migratory {
	static int angryBirds(int[]a)
	{
		int bird[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			bird[a[i]]++;
		}
		int max=-1,maxsize=0;
		for(int i=1;i<a.length;i++)
		{
			if(bird[i]>max)
			{
				max=bird[i];
				maxsize=i;
			}
		
		}	return maxsize;
	}
	public static void main(String args[])
	{
		int a[]= {1,2,2,3};
		System.out.println(angryBirds(a));

}
}
