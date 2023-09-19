package startproject;

import java.util.Scanner;

public class Exersise {
	static String  reverse(String s)
	{
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		return t;
	}
	static boolean isPalidrome(String s) {
	int i=0;
	int j=s.length()-1;
	while(i<=j) {
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in); 
		String s=scan.nextLine();
		//System.out.println(reverse(s));
		System.out.println(isPalidrome(s));

	}

}
