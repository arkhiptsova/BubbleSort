package FeetNumber;

import java.util.Scanner;

/*
Mila 
A program that implements a method that receives an array parameter
 and sorts that array using the bubble-sort algorithm show below. 
 The bubble-sort algorithm makes several passes through the array. 
 On each pass, successive neighboring pairs are compared. If a pair is 
 in decreasing order, its values are swapped: otherwise, the values remain
  unchanged. The technique is called a bubble sort because the smaller 
  values gradually "bubble" their way to the top.
BubbleSort.java
*/
public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		double[] numbers = new double[7]; // Create an array of length 15

		// Prompt the user to enter ten numbers
		System.out.print("Enter 7 numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		// Invoke bubblesort method
		bubbleSort(numbers);

		// display the sorted numbers
		for (double e: numbers) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	//bubbleSort method
	public static void bubbleSort(double[] list) {
		double temp;
		boolean changed;

		do {
			changed = false; 
			for (int i = 0; i < list.length - 1; i++) {
				// If a neighboring pair is not in order, swap values
				if (list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					changed = true;
				}
			}
		} while (changed); // Repeat if a value was swapped
	

	}

}
