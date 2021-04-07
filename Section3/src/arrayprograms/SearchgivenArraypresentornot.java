package arrayprograms;

public class SearchgivenArraypresentornot {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,10,20,20,10,10};
		int[] arr1= {100};
		for(int i=0; i<arr1.length; i++)
		{
			int num1=arr1[i];
			int count=0;
			for(int j=0; j<arr.length; j++)
			{
				int num2=arr[j];
				
				if(num1==num2&& i>j)
				{
					break;
				}
				if(num1==num2)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(num1+ "  prsent  "+count+ " times");
			}
			else
			{
				System.out.println("number is not present");
			}
		}
	}
}
