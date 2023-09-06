package com.xworkz.secondlargest;

public class SecondLargestValue {

	public static void main(String[] args) {

		int arr[] = { 5, 10, 8, 12, 67, 55, 1, 3, 80, 2 };
		int largestValue = 0;
		int secondLargestValue = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestValue) {
				secondLargestValue = largestValue;
				largestValue = arr[i];
			} else if (arr[i] > secondLargestValue) {
				secondLargestValue = arr[i];
			}
		}
		System.out.println(secondLargestValue);

	}

}
