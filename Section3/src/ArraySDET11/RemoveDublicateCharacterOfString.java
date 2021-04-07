package ArraySDET11;

import java.util.LinkedHashSet;
/*
 * output: inda
 */

public class RemoveDublicateCharacterOfString {
	public static void main(String[] args) {
		String s="india";
		for(int i=0; i<s.length();i++)
		{
			char ch1=s.charAt(i);
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2&&i>=j)
				{
					count++;
				}	
			}
				if(count==1)
				{
					
					System.out.print(ch1);
				}
		}
	}
}  
class Remove2
{
	public static void main(String[] args) {
		String s="india";
		char[] ch=s.toCharArray(); // convert into ary
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		for(Character c:set)
		{
			System.out.print(c);
		}
		
	}
}
