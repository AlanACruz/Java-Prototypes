package cruz.music.mode;

public abstract class Mode {
	
	public abstract String getRelativeTonic();

	public abstract int getFirst();
	
	public abstract int getSecond();
	
	public abstract int getThird();
	
	public abstract int getFourth();
	
	public abstract int getFifth();
	
	public abstract int getSixth();
	
	public abstract int getSeventh();
	
	/**
	 * Return all tones in a scale
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
				getSeventh()
		};
	}
}
