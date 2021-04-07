package ArraySDET11;
/*
 * 123abc10XYA5
 * o/p=123+10+5=138 
 */
public class SeperateNUmAndAddtion {
	public static void main(String[] args) {
		String s="123ab10cXYA";
		
		int sum=0;
		int num=0;
		//char[] ch=s.toCharArray();
		for(int i=0; i<s.length(); i++)
		{
		
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				num=num*10+n;
			}
			else
			{
				sum=sum+num;
				num=0;
			}
			
		}
		
		System.out.println(sum);
	}
}
class main1
{
	public static void main(String[] args) {
		String str="ghdhsgd111dsds21cs30hg";
		int sum=0;
		String num="0";
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			String s1=ch+"";
			try
			{
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
