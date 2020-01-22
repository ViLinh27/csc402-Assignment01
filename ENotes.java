package assignment1;
//Linh Nguyen
import algs4.StdAudio;
public class ENotes {

	public static void playTone(double frequency, double duration) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			slices[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
		}
		StdAudio.play(slices);
	}
	public static void main(String[] args) {
		playTone(329.628, 0.75);
		playTone(659.26, 0.75);
		playTone(1318.51, 0.75);
	    StdAudio.close();
        System.exit(0);
	}

}
