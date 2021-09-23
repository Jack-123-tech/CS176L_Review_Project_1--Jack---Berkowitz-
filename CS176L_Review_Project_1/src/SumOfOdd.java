import java.util.Scanner;
public class SumOfOdd {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int n = in.nextInt(); 
		int x = 1;
		 int sum = 0;
		 System.out.println("The first 5 positive odd integers are");
		 for (int i = 0; i < n; i++)
		 {
		  sum += x;
		  x += 2;
		  System.out.print(x+",");
		 }
		 System.out.println("");
		 System.out.println("The sum of the first 5 positive odd integers:"+sum);

		}
	

}
