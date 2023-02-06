/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.Iterator;

public class TheWrongWayCow {
static int NorthCow;
static int EastCow;
static int SouthCow;
static int WestCow;
static int nx;
static int wx;
static int ex;
static int sx;
static int ny;
static int wy;
static int ey;
static int sy;

    public static int[] findWrongWayCow(final char[][] field) {
    	 NorthCow = 0;
    EastCow= 0;
    	 SouthCow= 0;
    	 WestCow= 0;
     nx= 0;
    	 wx=0;
    	 ex=0;
   sx=0;
    	 ny=0;
   wy=0;
    	 ey=0;
     sy=0;
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        for (int i = 0; i < field.length; i++) {
        	for (int j = 0; j < field.length; j++) {
        		//make it so if 1 cows faces the same way then it decides that is the col row
        	
        	
        		//check directions of cows
        		if (field[i][j] == 'c') {
        			 //check south
        			 if (field[i+2][j] == 'w') {
        			SouthCow++;
        			sx = j;
    				sy = i;
    				System.out.println(SouthCow);
        			}//check east doesnt work
        			else if (field[i][j + 2] == 'w') {
        				EastCow++;
        				ex = j;
        				ey = i;
        			}//check north
        			else if (field[i-2][j] == 'w') {
        				NorthCow++;
        				nx = j;
        				ny = i;
        			}  //check west 
        			else if (field[i][j-2] == 'w') {
        				WestCow++;
        				wx = j;
        				wy = i;
        			
        			}
        		}
       }	}
    System.out.println(EastCow);
    if (NorthCow == 1) {
    	System.out.println("Return north");
    	return new int[] {nx, ny};
    } else if (EastCow == 1) {
    	System.out.println("Return east");
    	return new int[] {ex, ey};
    } else if (SouthCow == 1) {
    	System.out.println("Return south");
    	return new int[] {sx, sy};
    } else if (WestCow == 1) {
    	System.out.println("Return west");
     	return new int[] {wx, wy};
    } else {
    	 System.out.println("return nothing");
         return null;
    }
    
    }
}
