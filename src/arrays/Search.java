package arrays;

import java.util.Scanner;

public class Search {

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
		
		System.out.print("Enter an element to be searched: ");
		int target = sc.nextInt();
		
		for(int i=0; i<size; i++) {
			if(arr[i] == target) {
				System.out.println("Found at the index: " + i);
				break;
			}
			else {
				System.out.println("invalid value");
				break;
			}
		}

	}

}
