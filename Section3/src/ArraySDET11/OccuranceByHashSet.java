package ArraySDET11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceByHashSet {
	public static void main(String[] args) {
		String s="wlcome to ty";
		char[] ch=s.toCharArray();
		int count1=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		for(Character character: set)
		{
			int count=0;
			for(int i=0; i<ch.length; i++) {
				if(character==ch[i])
				{
					count++;
				}
			}
			//for occurance
			//System.out.println(character+" "+count);
			if(count>1)
			{
				System.out.println(character+" "+count);
			}
			//
	
			if(count>1)
			{
				count1++;
			}
		}
		System.out.println(" numbers are dublicate : "+count1);
	}
}
