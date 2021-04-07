package ArraySDET11;

import java.util.LinkedHashSet;

public class OccuranceOfWord {
	public static void main(String[] args) {
		String s="welcome to india welcome india";
		String[] ch=s.split(" ");
		int count1=0;
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		for(String str: set)
		{
			int count=0;
			for(int i=0; i<ch.length; i++)
			{
				if(str.equals(ch[i]))
				{
					count++;
				}
			}
			System.out.println(str+" "+count);
			if(count>1)
			{
				count1++;
			}
		}
		System.out.println(count1);
	}
}
