package arrays;

import java.util.Scanner;

public class ReadAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Entered array elements are ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
