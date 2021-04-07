package ArraySDET11;

public class BubleSort {
	public static void main(String[] args) {
		int arr[]= {40,30,20,10};
		System.out.print("before Sorting :");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		for(int i=0; i<arr.length-1; i++)
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
		System.out.print
		("\n After Sorting :");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nmin number :"+arr[0]);
		System.out.println("\nmaximun number :"+ arr[arr.length-1]);
		
	}
}
class Array
{
	public static void main(String[] args) {
		int[] arr= {50,40,30,20,10};
		for(int i=0; i<arr.length; i++)
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
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}
}