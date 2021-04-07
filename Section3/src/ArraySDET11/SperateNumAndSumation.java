package ArraySDET11;

public class SperateNumAndSumation {
	public static void main(String[] args) {
		String s="123@abc456$XYZ";
		String num="";
		int sum=0;
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>'0'&&ch[i]<'9')
			{
				int n=ch[i]-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
