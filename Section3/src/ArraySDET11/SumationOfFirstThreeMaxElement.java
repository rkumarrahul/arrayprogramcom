package ArraySDET11;

public class SumationOfFirstThreeMaxElement {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0; i<=2; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(" Addition of first three max number : "+
		sum);
	}
}
