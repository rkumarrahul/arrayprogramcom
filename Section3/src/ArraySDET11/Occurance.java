
package ArraySDET11;

public class Occurance {
	public static void main(String[] args) {
		String s="India";
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				char ch1=s.charAt(j);
				if(ch==ch1 &&i>j)
				{
					break;
				}
				if(ch==ch1)
				{
					count++;
				}
			}
			if(count>0) {
			System.out.println(ch +"  present "+count +"  times");
			}
		}

	}
}

