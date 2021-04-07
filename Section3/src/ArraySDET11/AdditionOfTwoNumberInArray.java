package ArraySDET11;

import java.util.HashSet;

public class AdditionOfTwoNumberInArray {
	public static void main(String[] args) {
		int[] ch= {1,3,4,5,2,6,9,7,4,3,1};
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		int ch1[]=new int[set.size()];
		int count=0;
		for(Integer value:set)
		{
			ch1[count]=value;
			count++;
		}
		
		for(int i=0; i<ch1.length-1; i++)
		{
			for(int j=i+1; j<ch1.length; j++)
			{
					if(ch[i]+ch[j]==7)
					{
						System.out.println(ch[i]+" "+ch[j]);
					}
			}
		}
	}
}



