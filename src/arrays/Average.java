package arrays;

import java.util.Scanner;

public class Average {

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
		
		int sum=0;
		for(int i=0; i<size; i++) {
			sum+=arr[i];

		}
		
		int average = sum/size;
		
		System.out.print("average is: " + average);

	}

}
