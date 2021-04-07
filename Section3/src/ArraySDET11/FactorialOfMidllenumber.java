package ArraySDET11;

public class FactorialOfMidllenumber {
	public static void main(String[] args) {
		int n=4321;
		int n1=n;
		int count=0;
		while(n1!=0)
		{
			n1=n1/10;
			count++;
		}
		for(int i=1; i<=count; i++)
		{
			int fact=1;
			n1=n;
			for(int j=1; j<=count; j++)
			{
				int dig=n1%10;
				if(i!=j)
				{
					fact=fact*dig;
				}
				n1=n1/10;
			}
			System.out.println(fact);	
		}
	}
}
