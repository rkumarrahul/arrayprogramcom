package ArraySDET11;

public class StringMaxLengthOrMINLength {
	public static void main(String[] args) {
		String s="welcome to india";
		String[] s1=s.split(" ");
		String var=s1[0];
		String var1=s1[0];
		int count=s1[0].length();
		for(int i=1; i<s1.length; i++)
		{
			if(s1[i].length()<var.length())
			{
				count=s1[i].length();
				var=s1[i];
			}
			else if(s1[i].length()>var1.length())
			{
				count=s1[i].length();
				var1=s1[i];
			}
		}
		System.out.println(var);
		System.out.println(var1);
	}
}
