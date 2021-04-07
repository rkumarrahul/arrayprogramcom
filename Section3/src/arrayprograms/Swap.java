package arrayprograms;

public class Swap {
	public static void main(String[] args) {
		String str="hello all happy diwali";
		String[] s=str.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(String s1: s)
		{
			System.out.print(s1 +" ");
		}
	}
}
