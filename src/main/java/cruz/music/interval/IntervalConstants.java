package cruz.music.interval;

public class IntervalConstants {
	
	/**
	 * Half Step
	 */
	public static final int SEMITONE = 1;
	
	/**
	 * Whole Step
	 */
	public static final int WHOLE_TONE = SEMITONE + SEMITONE;
	
	/**
	 * One Semitones
	 */
	public static final int FLAT = -SEMITONE;
	
	/**
	 * Two Semitones
	 */
	public static final int SHARP = SEMITONE;
		
	/**
	 * Zero Semitones
	 */
	public static final int PERFECT_UNITY = 0;
	
	/**
	 * One Semitones
	 */
	public static final int MINOR_SECOND = 1;
	
	/**
	 * Zero Semitones
	 */
	public static final int DIMINISHED_SECOND = MINOR_SECOND + FLAT;
	
	/**
	 * Two Semitones
	 */
	public static final int MAJOR_SECOND = 2;
	
	/**
	 * Three Semitones
	 */
	public static final int AUGMENTED_SECOND = MAJOR_SECOND + SHARP;
	
	/**
	 * Three Semitones
	 */
	public static final int MINOR_THIRD = 3;
	
	/**
	 * Two Semitones
	 */
	public static final int DIMINISHED_THIRD = MINOR_THIRD + FLAT;
	
	/**
	 * Four Semitones
	 */
	public static final int MAJOR_THIRD = 4;
	
	/**
	 * Five Semitones
	 */
	public static final int AUGMENTED_THIRD = MAJOR_THIRD + SHARP;
	
	/**
	 * Five Semitones
	 */
	public static final int PERFECT_FOURTH = 5;
	
	/**
	 * Six Semitones
	 */
	public static final int AUGMENTED_FOURTH = PERFECT_FOURTH + SHARP;
	
	/**
	 * Seven Semitones
	 */
	public static final int PERFECT_FIFTH = 7;
	
	/**
	 * Six Semitones
	 */
	public static final int DIMINISHED_FIFTH = PERFECT_FIFTH + FLAT;
	
	/**
	 * Eight Semitones
	 */
	public static final int AUGMENTED_FIFTH = PERFECT_FIFTH + SHARP;
	
	/**
	 * Eight Semitones
	 */
	public static final int MINOR_SIXTH = 8;
	
	/**
	 * Nine Semitones
	 */
	public static final int MAJOR_SIXTH = 9;
	
	/**
	 * Ten Semitones
	 */
	public static final int MINOR_SEVENTH = 10;
	
	/**
	 * Nine Semitones
	 */
	public static final int DIMINISHED_SEVENTH = MINOR_SEVENTH + FLAT;
	
	/**
	 * Eleven Semitones
	 */
	public static final int MAJOR_SEVENTH = 11;
	
	/**
	 * Twelve Semitones
	 */
	public static final int PERFECT_EIGHTH = 12;
	
	/**
	 * Twelve Semitones
	 */
	public static final int OCTAVE = PERFECT_EIGHTH;
	
	/**
	 * Thirteen Semitones
	 */
	public static final int MINOR_NINTH = OCTAVE + MINOR_SECOND;
	
	/**
	 * Fourteen Semitones
	 */
	public static final int MAJOR_NINTH = OCTAVE + MAJOR_SECOND;
	
	/** 
	 * Fifteen Semitones
	 */
	public static final int AUGMENTED_NINTH = MAJOR_NINTH + SHARP; 
	
	/** 
	 * Fifteen Semitones
	 */
	public static final int MINOR_TENTH = OCTAVE + MINOR_THIRD;
			
	/** 
	 * Sixteen Semitones
	 */
	public static final int MAJOR_TENTH = OCTAVE + MAJOR_THIRD;
	
	/** 
	 * Seventeen Semitones
	 */
	public static final int PERFECT_ELEVENTH = OCTAVE + PERFECT_FOURTH;
	
	/** 
	 * Eighteen Semitones
	 */
	public static final int AUGMENTED_ELEVENTH = PERFECT_ELEVENTH + SHARP;
	
	/** 
	 * Nineteen Semitones
	 */
	public static final int PERFECT_TWELFTH = OCTAVE + PERFECT_FIFTH; 
	
	/** 
	 * Eighteen Semitones
	 */
	public static final int DIMINISHED_TWELFTH = PERFECT_TWELFTH + FLAT;
	
	/** 
	 * Twenty Semitones
	 */
	public static final int AUGMENTED_TWELFTH = PERFECT_TWELFTH + SHARP;

	/** 
	 * Twenty Semitones
	 */
	public static final int MINOR_THIRTENTH = OCTAVE + MINOR_SIXTH;
	
	/** 
	 * Twenty One Semitones
	 */
	public static final int MAJOR_THIRTENTH = OCTAVE + MAJOR_SIXTH;
	
	/** 
	 * Twenty Two Semitones
	 */
	public static final int MINOR_FOURTEENTH = OCTAVE + MINOR_SEVENTH;
	
	/** 
	 * Twenty One Semitones
	 */
	public static final int DIMINISHED_FOURTEENTH = MINOR_FOURTEENTH + FLAT;
	
	/** 
	 * Twenty Three Semitones
	 */
	public static final int MAJOR_FOURTEENTH = OCTAVE + MAJOR_SEVENTH;
	
	/** 
	 * Twenty Four Semitones
	 */
	public static final int PERFECT_FIFTEENTH = OCTAVE + OCTAVE;
	
}
