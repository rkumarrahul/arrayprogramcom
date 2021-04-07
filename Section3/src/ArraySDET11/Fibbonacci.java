package ArraySDET11;

public class Fibbonacci {
	public static void main(String[] args) {
		int x=0;
		int y=1;
		System.out.println(x);
		System.out.println(y);
		for(int i=1; i<=4; i++)
		{
			
			int sum=x+y;
			x=y;
			y=sum;
			System.out.println(sum);
		}
	}
}
