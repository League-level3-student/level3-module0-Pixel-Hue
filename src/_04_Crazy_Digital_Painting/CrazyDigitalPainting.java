package _04_Crazy_Digital_Painting;
import java.awt.Color;
public class CrazyDigitalPainting {
    // 1. Create two final static integers for the width and height of the display.
final static int WIDTH = 1920;
final static int HEIGHT = 1080;
     // 2. Create a 2D array of Color objects. You will need to import
    //    java.awt.Color. Initialize the size of the array using the 
    //    integers created in step 1.
static Color[][] colors = new Color[WIDTH][HEIGHT];
//fix this /\


    public CrazyDigitalPainting() {
        // 3. Open the crazy_digital_painting.png file and look at the image.

        // 4. Iterate through the 2D array and initialize each Color object
        //    to a new color. The sample image was created using the following 
        //    pattern:
    	for(int i = 0; i < WIDTH; i++) {
    		for(int j = 0; j < HEIGHT; j++) {
    			colors[i][j] = new Color(j / 10, j / 5, i / 10);
    		}
    	}
    
           

        // 5. Come up with your own pattern to make a cool crazy image.

        // 6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
        //    to show off your picture.
    	
    }

    public static void main(String[] args) {
        new CrazyDigitalPainting();
    	ColorArrayDisplayer.displayColorsAsImage(colors);
    }
}
