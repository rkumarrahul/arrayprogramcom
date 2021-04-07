package arrayprograms;

public class SumationNumberString {
	public static void main(String[] args) {
		String str="hi12bye44why20hello";
		int sum=0;
		String num="0";
		for(int i=0; i<str.length(); i++)	
		{
			char ch=str.charAt(i);
			String s1=ch+"";
			try {
				int x=Integer.parseInt(s1);
				num=num+x;
			}
			catch(NumberFormatException e)
			{
				int y=Integer.parseInt(num);
				sum=sum+y;
				num="0";
			}
		}
		System.out.println(sum);
	}
}
