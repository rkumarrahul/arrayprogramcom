package ArraySDET11;

public class Decendingorder {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		System.out.print("before Sorting :");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
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
		System.out.print
		("\n After Sorting :");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nmin number :"+arr[arr.length-1]);
		System.out.println("maximun 1st number :"+ arr[0]);
		System.out.println("maximun 2nd number :"+ arr[1]);
		System.out.println("maximun 3rd number :"+ arr[2]);
		
	}

}
