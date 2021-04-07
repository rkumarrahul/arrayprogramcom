package ArraySDET11;

public class SwapofEvenToOddindex {
	public static void main(String[] args) {
		String s="welcome to tyss";
		String[] s1=s.split(" ");
		int n=s1.length;
		if(s1.length%2!=0)
		{
			n=s1.length-1;
		}
		for(int i=0; i<n; i++)
		{
			if(i%2==0)
			{
				String temp=s1[i];
				s1[i]=s1[i+1];
				s1[i+1]=temp;
			}
		}
		for(String str:s1)
		{
			System.out.print(str+" ");
		}
	}
}
