import java.util.Scanner;

public class Odd_values {

	public static void main(String[] args) {
		int[] arr=new int[5];
		int i;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the values");
		for(i=0;i<5;i++)
		{
			arr[i]=kb.nextInt();
		
		if(arr[i]%2!=0)
		{
		System.out.print(arr[i]+" ");
		}
		}
	}
}
