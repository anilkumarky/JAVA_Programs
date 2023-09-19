package startproject;

import java.util.Arrays;

public class Practice1 {
	static boolean isAnagram(String s1,String s2) {
		String temp="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ')
			{
				temp=temp+s1.charAt(i);
			}
		}
		s1=temp;
		temp="";
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)!=' ')
			{
				temp=temp+s2.charAt(i);
			}
		}
		s2=temp;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		s1=new String(arr1);
		s2=new String(arr2);
		
		return s1.equals(s2);
	}
	static boolean isPanagram(String s) {
		String t="abcdefghijklmnopqrstuvwxyz";
		s=s.toLowerCase();
		System.out.println(s);
		int count=0;
		for(int i=0;i<t.length();i++) {
			if(s.indexOf(t.charAt(i))>=0)
				count++;
			else
				break;
		
		}
		System.out.println(count);
		if(count==26)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String s1="Funeral";
		String s2="Real Fun";
		String s="A quick brown fox jumps over the lazy dog";
		//System.out.println(isAnagram(s1,s2));
		System.out.println(isPanagram(s));
	}

}
