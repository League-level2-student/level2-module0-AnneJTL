package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arrayOfStrings = new String[5];
		
		//2. print the third element in the array
		System.out.println("The third element is: " + arrayOfStrings[2]);
		
		//3. set the third element to a different value
		arrayOfStrings[2] = "I'm the third element !!!";
		
		//4. print the third element again
		System.out.println("The third element is: " + arrayOfStrings[2]);


		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0; i < arrayOfStrings.length; i++){
			System.out.println("The " + i + " element is: " + arrayOfStrings[i]);
		}

		//6. make an array of 50 integers
		int[] arrayOfInteger = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random randomNumber = new Random();
		for(int i =0; i< arrayOfInteger.length; i++){
			arrayOfInteger[i] = randomNumber.nextInt(200);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int min = 200;
		int index = -1;
		for(int i =0; i < arrayOfInteger.length; i++) {
			if (arrayOfInteger[i] < min){
				min = arrayOfInteger[i];
				index = i;
			}
		}
		if (index == -1) System.out.println("Hum... the index is bad !!!");
		else System.out.println("The smallest number is: " + min + " at index: " + index);
		
		//9 print the entire array to see if step 8 was correct
		System.out.println("The entire array.");
        System.out.println(Arrays.toString(arrayOfInteger));

		//10. print the largest number in the array.
		int max = 0;
		index = -1;
		for(int i =0; i < arrayOfInteger.length; i++) {
			if (arrayOfInteger[i] > max){
				max = arrayOfInteger[i];
				index = i;
			}
		}
		if (index == -1) System.out.println("Hum... the index is bad !!!");
		else System.out.println("The largest number is: " + max + " at index: " + index);

	}
}
