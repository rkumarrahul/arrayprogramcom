package arrayprograms;

public class ArrayAsendingOrder {
	public static void main(String[] args) {
		int[] arr= {45,12,89,66,10,77};
		
		System.out.println(" before sort : " );
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.println("\n after sort: ");
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
		
		
	}
}
