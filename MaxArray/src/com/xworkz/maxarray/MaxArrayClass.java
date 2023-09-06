package com.xworkz.maxarray;

public class MaxArrayClass {

	public static void main(String[] args) {
		
		int arr[] = {10,40,30,50,20,70,60};
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}

}
