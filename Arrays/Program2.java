package Arrays;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] =  new int[size];
		System.out.println("Enter array elements:");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("--------Entered Elements:-------------");
		for(int i = 0; i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n--------------Even elements:--------------");
		printEven(arr);
	}
	
	public static void printEven(int arr[]) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+ " ");
			}
		}
	}
}
