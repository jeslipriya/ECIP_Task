package arrays;

import java.util.Scanner;

public class OccurrenceCount {

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
		
		System.out.print("Enter the value to be searched: ");
		int val = sc.nextInt();
		
		int count=0;
		for(int i=0; i<size; i++) {
			if(arr[i] == val) {
				count++;
			}
		}
		
		System.out.println("No. of occurrence = " + count);
	}

}
