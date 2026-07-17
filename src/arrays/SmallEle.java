package arrays;

import java.util.Scanner;

public class SmallEle {

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
		
		int small = arr[0];
		
		for(int i=1; i<size; i++) {
			if(arr[i] < small) {
				small = arr[i];
			}
		}
		
		System.out.println("Largest element is: " + small);

	}

}
