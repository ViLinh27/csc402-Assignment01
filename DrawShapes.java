package assignment1;
//Linh Nguyen
import algs4.StdDraw;

public class DrawShapes {

	public static void main(String[] args) {
		//green square lower left
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(.25, .25, .25);
		//blue circle upper left
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(.25, .75, .25);
		//yellow circle lower right
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(.75, .25, .25);
		//red square upper right
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledSquare(1, 1, .5);

	}

}
