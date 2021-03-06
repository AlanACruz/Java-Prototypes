package cruz.music.tone.scale;

/**
 * @author CruzA
 */
public abstract class Diatonic extends Scale {
	
	public abstract String getFeelingString();
	
	public abstract String getRelativeTonicString();

	public abstract String getTriSuffixString();
	
	public abstract String getSeventhSuffixString();
	
	/* First Octave */
	
	public abstract int getFirst();
	
	public abstract int getSecond();
	
	public abstract int getThird();
	
	public abstract int getFourth();
	
	public abstract int getFifth();
	
	public abstract int getSixth();
	
	public abstract int getSeventh();
	
	/* Second Octave */
	
	public abstract int getEighth();
	
	public abstract int getNinth();
	
	public abstract int getTenth();
	
	public abstract int getEleventh();
	
	public abstract int getTwelfth();
	
	public abstract int getThirteenth();
	
	public abstract int getFourteenth();
	
	/* Third Octave */
	
	public abstract int getFifteenth();
	
	/**
	 * Return all tones in a scale.  First, Second, Third, Fourth, Fifth, Sixth, Seventh, 
	 * Eighth, Ninth, Tenth, Eleventh, Twelfth, Thirteenth, Fourteenth, & Fifteenth.
	 * 
	 * @return scale array
	 */
	public int[] getScale() {

		return new int[] {
				getFirst(),
				getSecond(),
				getThird(),
				getFourth(),
				getFifth(),
				getSixth(),
				getSeventh(),
				getEighth(),
				getNinth(),
				getTenth(),
				getEleventh(),
				getTwelfth(),
				getThirteenth(),
				getFourteenth(),
				getFifteenth()
		};
	}
}
