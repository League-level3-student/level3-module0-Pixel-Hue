package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] names = new String[5];
names[0] = "Alex";
names[1] = "Toby";
names[2] = "Rick";
names[3] = "Marty";
names[4] = "Larry";
        // 2. print the third element in the array
System.out.println(names[2]);
        // 3. set the third element to a different value
names[2] = "Josh";
        // 4. print the third element again
System.out.println(names[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < names.length; i++) {
	names[i] = "Joe";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < names.length; i++) {
	System.out.println(names[i]);
}
        // 7. make an array of 50 integers
int[] numbers = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random random = new Random();
for (int i = 0; i < numbers.length; i++) {
	numbers[i] = random.nextInt(50);
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
boolean loopDone = false;
int numLoop = 0;
for (int i = 0; i < numbers.length; i++) {
	numLoop=0;
	if (loopDone==false) {
	for (int j = 0; j < numbers.length; j++) {
if(numbers[i] <= numbers[j]) {
	numLoop++;
}
if (numLoop==50) {
	System.out.println("The smallest number is " + numbers[i]);
	loopDone=true;
	System.out.println("done");
}
	}
	}
}
System.out.println("---------------");
        // 10 print the entire array to see if step 8 was correct
// fix number 9 its not done

for (int i = 0; i < numbers.length; i++) {
	System.out.println(numbers[i]);
}
        // 11. print the largest number in the array.
System.out.println("---------------");
loopDone = false;
for (int i = 0; i < numbers.length; i++) {
	numLoop=0;
	if (loopDone==false) {
	for (int j = 0; j < numbers.length; j++) {
if(numbers[i] >= numbers[j]) {
	numLoop++;
	
}
if (numLoop==50) {
	System.out.println("The largest number is " + numbers[i]);
	loopDone=true;

}
	}
	}
}
        // 12. print only the last element in the array
System.out.println(numbers[48]);
System.out.println(numbers[49]);
    }
}
