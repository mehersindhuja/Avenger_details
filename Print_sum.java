import java.util.Scanner;

public class Print_sum {

	public static void main(String[] args) {
		int[] arr=new int[5];
		int i,sum=0;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the values");
		for(i=0;i<5;i++)
		{
			arr[i]=kb.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The sum is "+sum);
		}
}