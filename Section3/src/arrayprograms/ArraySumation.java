package arrayprograms;

public class ArraySumation {
	public static void main(String[] args) {
		int[] arr= {10,20,10,30,40,50};
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			int num1=arr[i];
			sum=sum+num1;
		}
		System.out.println(sum);
	}
}
