package ArraySDET11;

public class AdditionofNumAndSumComeBelow10 {
	public static void main(String[] args) {
		int num=789;
		int sum=0;
		int sum1=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		//System.out.println(sum);
		
		while(sum>10)
		{
			int sum2=sum;
			while(sum2!=0)
			{
				int rem=sum2%10;
				sum1=sum1+rem;
				sum2=sum2/10;
				sum=sum1;
			}
		}
		/*else
		{
			System.out.println(sum);
		}  */
		System.out.println(sum);
	}
}
