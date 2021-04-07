package ArraySDET11;

public class PrintSpecificNumberInWord {
	public static void main(String[] args) {
		int n=20;
		for(int i=1; i<=n; i++)
		{
			if(n==7)
			{
				System.out.println("seven");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
}
class ray11
{
	public static void main(String[] args) {
		int size=20;
		int num=11;
		int [] arr=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=num;
			num++;
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==20)
			{
				System.out.print("twenty ");
				
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
			}
			
	
}

class Occ
{
	public static void main(String[] args) {
		String s="mahabharat";
		for(int i=0; i<s.length(); i++)
		{
			char ch1=s.charAt(i);
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2&&i>j)
				{
					break;
				}
				if(ch1==ch2)
				{
					count++;
				}
			}
			if(count>1) {
			System.out.println(ch1+"  prsent "+ count+ "  times");
		}}
	}
}

