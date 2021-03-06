package cruz.music.interval;

/**
 * @author CruzA
 */
public class Interval {
	
	/* Flat & Sharp */
	
	/**
	 * One Semitones
	 */
	public static final int FLAT = -Semitone.SEMITONE;
	
	/**
	 * Two Semitones
	 */
	public static final int SHARP = Semitone.SEMITONE;
	
	/* Chromatic First Octave */
	
	/**
	 * Zero Semitones
	 */
	public static final int PERFECT_UNITY = Semitone.ZERO;
	
	/**
	 * One Semitones
	 */
	public static final int MINOR_SECOND = Semitone.ONE;
	
	/**
	 * Two Semitones
	 */
	public static final int MAJOR_SECOND = Semitone.TWO;

	/**
	 * Three Semitones
	 */
	public static final int MINOR_THIRD = Semitone.THREE;

	/**
	 * Four Semitones
	 */
	public static final int MAJOR_THIRD = Semitone.FOUR;
	
	/**
	 * Five Semitones
	 */
	public static final int PERFECT_FOURTH = Semitone.FIVE;
	
	/**
	 * Six Semitones
	 */
	public static final int DIMINISHED_FIFTH = Semitone.SIX;
	
	/**
	 * Seven Semitones
	 */
	public static final int PERFECT_FIFTH = Semitone.SEVEN;
	
	/**
	 * Eight Semitones
	 */
	public static final int AUGMENTED_FIFTH = Semitone.EIGHT;

	/**
	 * Nine Semitones
	 */
	public static final int MAJOR_SIXTH = Semitone.NINE;
	
	/**
	 * Ten Semitones
	 */
	public static final int MINOR_SEVENTH = Semitone.TEN;
	
	/**
	 * Eleven Semitones
	 */
	public static final int MAJOR_SEVENTH = Semitone.ELEVEN;
	
	/* Chromatic Second Octave */
	
	/**
	 * Twelve Semitones
	 */
	public static final int PERFECT_EIGHTH = Octave.ONE;

	/**
	 * Thirteen Semitones
	 */
	public static final int MINOR_NINTH = MINOR_SECOND + Octave.ONE;
	
	/**
	 * Fourteen Semitones
	 */
	public static final int MAJOR_NINTH = MAJOR_SECOND + Octave.ONE;
	
	/** 
	 * Fifteen Semitones
	 */
	public static final int MINOR_TENTH = MINOR_THIRD + Octave.ONE;
			
	/** 
	 * Sixteen Semitones
	 */
	public static final int MAJOR_TENTH = MAJOR_THIRD + Octave.ONE;
	
	/** 
	 * Seventeen Semitones
	 */
	public static final int PERFECT_ELEVENTH = PERFECT_FOURTH + Octave.ONE;
	
	/**
	 * Eighteen Semitones
	 */
	public static final int DIMINISHED_TWELFTH = PERFECT_FIFTH + FLAT + Octave.ONE;
	
	/** 
	 * Nineteen Semitones
	 */
	public static final int PERFECT_TWELFTH = PERFECT_FIFTH + Octave.ONE; 
	
	/**
	 * Twenty Semitones
	 */
	public static final int AUGMENTED_TWELFTH = PERFECT_FIFTH + SHARP + Octave.ONE;
	
	/** 
	 * Twenty One Semitones
	 */
	public static final int MAJOR_THIRTENTH = MAJOR_SIXTH + Octave.ONE;
	
	/** 
	 * Twenty Two Semitones
	 */
	public static final int MINOR_FOURTEENTH = MINOR_SEVENTH + Octave.ONE;
	
	/** 
	 * Twenty Three Semitones
	 */
	public static final int MAJOR_FOURTEENTH = MAJOR_SEVENTH + Octave.ONE;
	
	/* Chromatic Third Octave */
	
	/** 
	 * Twenty Four Semitones
	 */
	public static final int PERFECT_FIFTEENTH = Octave.TWO;
	
	/**
	 * Twenty Five Semitones
	 */
	public static final int MINOR_SIXTEENTH = MINOR_SECOND + Octave.TWO;
	
	/**
	 * Twenty Six Semitones
	 */
	public static final int MAJOR_SIXTEENTH = MAJOR_SECOND + Octave.TWO;
	
	/** 
	 * Twenty Seven Semitones
	 */
	public static final int MINOR_SEVENTEENTH = MINOR_THIRD + Octave.TWO;
			
	/** 
	 * Twenty Eight Semitones
	 */
	public static final int MAJOR_SEVENTEENTH = MAJOR_THIRD + Octave.TWO;
	
	/** 
	 * Twenty Nine Semitones
	 */
	public static final int PERFECT_EIGHTEENTH = PERFECT_FOURTH + Octave.TWO;
	
	/** 
	 * Thirty Semitones
	 */
	public static final int DIMINISHED_NINETEENTH = DIMINISHED_FIFTH + Octave.TWO;
	
	/** 
	 * Thirty First Semitones
	 */
	public static final int PERFECT_NINETEENTH = PERFECT_FIFTH + Octave.TWO;
	
	/** 
	 * Thirty Second Semitones
	 */
	public static final int AUGMENTED_NINETEENTH = AUGMENTED_FIFTH + Octave.TWO;
	
	/** 
	 * Thirty Third Semitones
	 */
	public static final int MAJOR_TWENTIETH = MAJOR_SIXTH + Octave.TWO;
	
	/** 
	 * Thirty Fourth Semitones
	 */
	public static final int MINOR_TWENTY_FIRST = MINOR_SEVENTH + Octave.TWO;
	
	/** 
	 * Thirty Fifth Semitones
	 */
	public static final int MAJOR_TWENTY_FIRST = MAJOR_SEVENTH + Octave.TWO;
	
	/* Chromatic Fourth Octave */
	
	/** 
	 * Twenty Sixth Semitones
	 */
	public static final int PERFECT_TWENTY_SECOND = Octave.THREE;
}