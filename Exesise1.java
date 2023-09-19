package startproject;

import java.util.Scanner;

public class Exesise1 {
	static void printAllSubstring(String st,String k) {
		int n=st.length();
	 
		
			for(int s=0;s <= n-k;s++)
			{
				for(int e=s;e <= s-k;e++) 
				{
					System.out.print(st.charAt(e));
				}
			}System.out.println();
		}
	

	public static void main(String[] args) {
		//Scanner scan =new Scanner(System.in);
		String s="abcde";
	  printAllSubstring(s,2);
	}

}
