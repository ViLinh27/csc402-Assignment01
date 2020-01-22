package assignment1;
//Linh Nguyen
import algs4.*;

public class ComputePower {
	public static long power(int i, int j) {
		if (j==0) {
			return 1;
		}
		
		return (long) (i * power(i,j-1));
	}

	public static void main(String[] args) {
		// make a method that calculates two ints a and b and outputs a^b
		StdOut.print("Enter your first number: ");
		int i = Integer.parseInt(StdIn.readLine());
		StdOut.print("Enter your second number: ");
		int j = Integer.parseInt(StdIn.readLine());
		StdOut.print(power(i,j));
	}

}
