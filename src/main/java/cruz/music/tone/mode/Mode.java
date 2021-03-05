package cruz.music.tone.mode;

/**
 * @author CruzA
 */
public abstract class Mode {
	
	public abstract String getRelativeTonicString();

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
	
	/**
	 * Return all tones in a scale. First & Third.
	 * 
	 * @return scale array
	 */
	public int[] getDyad() {

		return new int[] {
				getFirst(),
				getThird()
		};
	}
	
	/**
	 * Return all tones in a scale. Third & Eighth
	 * 
	 * @return scale array
	 */
	public int[] getDyadInversion() {

		return new int[] {
				getThird(),
				getEighth()
		};
	}
	
	/**
	 * Return all tones in a scale. First & Fifth
	 * 
	 * @return scale array
	 */
	public int[] getPowerChord() {

		return new int[] {
				getFirst(),
				getFifth()
		};
	}
	
	/**
	 * Return all tones in a scale. Fifth & Eighth
	 * 
	 * @return scale array
	 */
	public int[] getPowerChordInversion() {

		return new int[] {
				getFifth(),
				getEighth()
		};
	}
}
