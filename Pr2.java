package startproject;
import java.util.*;
public class Pr2 {
	static String toUpperCase(String s) {
		String t= " ";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c>='a' &&c<='z')
			{
				 t=t+(char)(c-32);
			}
			else
			{
				t=t+c;
			}
		}
		return t;
	}
	static String toLowerCase(String s) {
		String t= " ";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c>='A' &&c<='Z')
			{
				 t=t+(char)(c+32);
			}
			else
			{
				t=t+c;
			}
		}
		return t;
	}
	static int indexOf(String s,String c) {
		char key=c.charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==key) {
				return i;
			}
		} return -1;
		
	}
	static int indexOf(String s,String c,int k) {
		char key=c.charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==key) {
				count++;
			}
			if(count==k)
			{
				return i;
			}
		} 
		
	}
	static int lastIndexOf(String s,String c) {
		char key=c.charAt(0);
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==key) {
				return i;
			}
		} return -1;
		
	}
	static String trimIndex(String s) {
		String t= "";
		int ei=0,si=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				 si=i;
			break;
		}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) !=  ' ') {
				ei=i;
				break;
				
			}
		}
		for(int i=si;i<=ei;i++)
		{
			t=t+s.charAt(i);
		}return t;
		}
		static char[] toCharArray(String str) {
			char c[]= new char[str.length()];
			for(int i=0;i<str.length();i++) {
				c[i]=str.charAt(i);
			}return c;
		}
		static boolean equals(String s1,String s2) {
			if(s1.length() != s2.length()){
				return false;
			}
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		static boolean startWith(String s,String t) {
			int count=0;
			for(int i=0;i<t.length();i++) {
				if(s.charAt(i) == t.charAt(count))
				{
					count++;
				}
			}
			if(t.length()== count ) {
				return true;
			}
			else
			{
				return false;
			}
		}
		static boolean endsWith(String s,String t) {
			int count=0;
			for(int i=s.length() - t.length();i<s.length();i++) {
				if(s.charAt(i) == t.charAt(count))
				{
					count++;
				}
			}
			if(t.length()== count ) {
				return true;
			}
			else
			{
				return false;
			}
		}
		static boolean contains(String s,String t) {
			int count=0;
			for(int i=0;i<s.length() && count<t.length();i++) {
				if(s.charAt(i) == t.charAt(count))
				{
					count++;
				}
				else
				{
					count =0;
				}
			}
			if(t.length()== count ) {
				return true;
			}
			else
			{
				return false;
			}
		}
		static String replace(String str,char old_char,char new_char) {
			char[] s= toCharArray(str);
			for (int i=0;i<s.length;i++)
			{
				if(s[i]== old_char) {
					s[i] = new_char;  
				}
			}
			return new String(s);
		}
		static String  StartIndex(String s,int startindex,int endindex) {
			String t="";
			for(int i=startindex;i<endindex;i++) {
				t=t+s.charAt(i);
			}
			return t;
		}
	
					
			
		
		
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s= scan.nextLine();
		int startindex=scan.nextInt();
		int endindex=scan.nextInt();
		//String t= scan.nextLine();
		//String c =scan.nextLine();
		//int k=scan.nextInt()
		//System.out.println(indexOf(s,c));
		//System.out.println(lastIndexOf(s,c));
		//System.out.println(trimIndex(s));
		//System.out.println(toCharArray(s));		
		//System.out.println(equals(s1,s2));
		//System.out.println(startWith(s,t));
		//System.out.println(endsWith(s,t));
		//System.out.println(contains(s,t));
		//System.out.println(replace(s,old_char,new_char));
		System.out.println(StartIndex(s,startindex,endindex));
	}

}
