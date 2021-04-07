package ArraySDET11;

public class SeprateNumOrSpclChar {
	public static void main(String[] args) {
		String s="123@abc456$XYZ";
		String num="";
		String spcl="";
		String alpha="";
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='A'&&ch[i]<='z')
			{
				alpha=alpha+ch[i];
			}
			else if(ch[i]>'0'&&ch[i]<'9')
			{
				num=num+ch[i];
			}
			else
			{
				spcl=spcl+ch[i];
			}
		}
		System.out.println(alpha);
		System.out.println(spcl);
		System.out.println(num);
	}
}
