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
        	for (int j = 0; j < field[i].length; j++) {
       // System.out.println(field[i][j]);
        		//make it so if 1 cows faces the same way then it decides that is the col row
        	
        	
        		//check directions of cows
        		if (field[i][j] == 'c') {
        			 //check south
        			 if (i + 2 < field.length && field[i+2][j] == 'w' && field[i+1][j] == 'o') {
        			SouthCow++;
        			sx = j;
    				sy = i;
    				
        			}//check east
        			 if (j + 2 < field[i].length && field[i][j + 2] == 'w' && field[i][j + 1] == 'o') {
        				EastCow++;
        				ex = j;
        				ey = i;
        			}//check north
        		 if (i-2 >= 0 && field[i-2][j] == 'w' && field[i-1][j] == 'o') {
        				NorthCow++;
        				nx = j;
        				ny = i;
        			}  //check west 
        			 if (j-2 >= 0 && field[i][j-2] == 'w' && field[i][j-1] == 'o') {
        				WestCow++;
        				wx = j;
        				wy = i;
        			
        			}
        		}
       }	
        	}
        //Print num cows of each direction
   /* System.out.println("Number of north cows " + NorthCow);
    System.out.println("Number of east cows " + EastCow);
    System.out.println("Number of west cows " + WestCow);
    System.out.println("Number of south cows " + SouthCow);
    System.out.println("done");*/
    
    //return
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
         return new int[] {3, 0};
    }
    
    }
}
    
