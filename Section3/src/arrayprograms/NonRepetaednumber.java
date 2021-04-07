package arrayprograms;

public class NonRepetaednumber {
	public static void main(String[] args) {
		int[] arr= {10,20,20,30,50,30,60,80,80,80};
		
		for(int i=0; i<arr.length; i++)
		{
			int num1=arr[i];
			int count=0;
			for(int j=0; j<arr.length; j++)
			{
				int num2=arr[j];
				if(num1==num2)
				{
					count++;
				}
			}
			if(count==1)
			{
				
				System.out.println(num1+" present"+count+ " times");
			}
		}
		
	}
}
