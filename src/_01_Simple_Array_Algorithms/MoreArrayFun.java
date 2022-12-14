package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] arr= {"a", "b", "c", "d", "e"};

	printS(arr);
	System.out.println("---");
	RevPrintS(arr);
	System.out.println("---");
	EOString(arr);
	System.out.println("---");
	RandomOrder(arr);

}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
static void printS(String[] arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}


    static //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
void RevPrintS(String[] array) {
	for (int i = array.length-1; i >= 0; i--) {
		System.out.println(array[i]);
	}
}


    static //4. Write a method that takes an array of Strings and prints every other String in the array.
void EOString(String[] array) {
	for (int i = 0; i < array.length; i+=2) {
		System.out.println(array[i]);
	}
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
    static Random ran = new Random();
    
    //make arraylist int
static void RandomOrder(String[] array) {
    	 List<String> list = Arrays.asList(array);
    	Collections.shuffle(list);
    	list.toArray(array);
    	for (int j = 0; j < array.length; j++) {
    		System.out.println(array[j]);
		}
    	
		}
		
		//remove array that was printed to use all numbers

}


