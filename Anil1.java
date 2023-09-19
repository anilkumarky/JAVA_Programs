package startproject;
import java.util.Scanner;
public class Anil1 {
	static void nonRepString(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			String temp="";
			for(int j=i;j<s.length();j++) {
				if (temp.indexOf(s.charAt(j)) == -1)
{
					temp=temp+s.charAt(j);
				}
				else
				{
					break;
				}
			}
			if (temp.length() > res.length()) {
			    res = temp;
			}
		}System.out.println(res.length());
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		nonRepString(s);
		

	}

}
