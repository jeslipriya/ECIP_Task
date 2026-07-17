package arrays;

import java.util.Scanner;

public class OddEvenCount {

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
		
		int odd=0,even=0;
		for(int i=0; i<size; i++) {
			if(arr[i]/2 ==0) {
				even++;
			}
			odd++;
		}
		
		
		System.out.println("Even count: " + even);
		System.out.println("Odd count: " + odd);

	}

}
