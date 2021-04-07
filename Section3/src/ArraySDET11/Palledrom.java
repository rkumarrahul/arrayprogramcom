package ArraySDET11;

public class Palledrom {
	public static void main(String[] args) {
		int num=101;
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("no is palledrom");
			
		}
		else
		{
			System.out.println("no is not palledrom");
		}
	}
}
