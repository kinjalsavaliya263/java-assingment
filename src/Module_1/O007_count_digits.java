/**
 * 
 */
package Module_1;

import java.util.Scanner;

/**
 * Write a Java program that reads a positive integer and count the number of
 * digits the number. Input an integer number less than ten billion: 125463
 * Number of digits in the number: 6
 *
 */
public class O007_count_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the value of n : ");
		n = sc.nextInt();
		// System.out.println(n);
		int count = 0;
		if (n > 0) {

			while (n != 0) {
				n = n / 10;
				++count;
			}
			System.out.println(count);
		} else {
			System.out.println("Enter the correct value.....");
		}
		sc.close();
	}
}
