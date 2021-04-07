package ArraySDET11;

import java.util.LinkedHashSet;

public class RemoveDublicateWord {
	public static void main(String[] args) {
		String s="welcome to india welcome to welcome mandya";
		String[] str=s.split(" ");
		for(int i=0; i<str.length;i++)
		{
			String ft=str[i];
			int count=0;
			for(int j=0; j<str.length; j++ )
			{
				String sd=str[j];
				if(ft.equals(sd)&&i>=j)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ft +" ");
			}
		}
	}

}
class RemoveDubWord
{
	public static void main(String[] args) {
		String s="welcome to india welcome to welcome mandya";
		String[] s1=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<s1.length; i++)
		{
			set.add(s1[i]);
		}
		for(String ch:set)
		{
			System.out.print(ch+" ");
		}
	}
}
