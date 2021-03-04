package cruz.music.interval;

public class IntervalConstants {
	
	/* Steps */
	
	/**
	 * Half Step
	 */
	public static final int SEMITONE = 1;
	
	/**
	 * Whole Step
	 */
	public static final int WHOLE_TONE = SEMITONE + SEMITONE;
	
	/* Flat & Sharp */
	
	/**
	 * One Semitones
	 */
	public static final int FLAT = -SEMITONE;
	
	/**
	 * Two Semitones
	 */
	public static final int SHARP = SEMITONE;
	
	/* Chromatic First Octave */
	
	/**
	 * Zero Semitones
	 */
	public static final int PERFECT_UNITY = 0;
	
	/**
	 * One Semitones
	 */
	public static final int MINOR_SECOND = 1;
	
	/**
	 * Two Semitones
	 */
	public static final int MAJOR_SECOND = 2;

	/**
	 * Three Semitones
	 */
	public static final int MINOR_THIRD = 3;

	/**
	 * Four Semitones
	 */
	public static final int MAJOR_THIRD = 4;
	
	/**
	 * Five Semitones
	 */
	public static final int PERFECT_FOURTH = 5;
	
	/**
	 * Six Semitones
	 */
	public static final int DIMINISHED_FIFTH = PERFECT_FOURTH + SHARP;
	
	/**
	 * Seven Semitones
	 */
	public static final int PERFECT_FIFTH = 7;
	
	/**
	 * Eight Semitones
	 */
	public static final int AUGMENTED_FIFTH = PERFECT_FIFTH + SHARP;

	/**
	 * Nine Semitones
	 */
	public static final int MAJOR_SIXTH = 9;
	
	/**
	 * Ten Semitones
	 */
	public static final int MINOR_SEVENTH = 10;
	
	/**
	 * Eleven Semitones
	 */
	public static final int MAJOR_SEVENTH = 11;
	
	/* Chromatic Second Octave */
	
	/**
	 * Twelve Semitones
	 */
	public static final int OCTAVE = 12; ;
	
	/**
	 * Twelve Semitones
	 */
	public static final int PERFECT_EIGHTH = OCTAVE;

	/**
	 * Thirteen Semitones
	 */
	public static final int MINOR_NINTH = MINOR_SECOND + OCTAVE;
	
	/**
	 * Fourteen Semitones
	 */
	public static final int MAJOR_NINTH = MAJOR_SECOND + OCTAVE;
	
	/** 
	 * Fifteen Semitones
	 */
	public static final int MINOR_TENTH = MINOR_THIRD + OCTAVE;
			
	/** 
	 * Sixteen Semitones
	 */
	public static final int MAJOR_TENTH = MAJOR_THIRD + OCTAVE;
	
	/** 
	 * Seventeen Semitones
	 */
	public static final int PERFECT_ELEVENTH = PERFECT_FOURTH + OCTAVE;
	
	/**
	 * Eighteen Semitones
	 */
	public static final int DIMINISHED_TWELFTH = PERFECT_ELEVENTH + SHARP;
	
	/** 
	 * Nineteen Semitones
	 */
	public static final int PERFECT_TWELFTH = PERFECT_FIFTH + OCTAVE; 
	
	/**
	 * Twenty Semitones
	 */
	public static final int AUGMENTED_TWELFTH = PERFECT_TWELFTH + SHARP;
	
	/** 
	 * Twenty One Semitones
	 */
	public static final int MAJOR_THIRTENTH = MAJOR_SIXTH + OCTAVE;
	
	/** 
	 * Twenty Two Semitones
	 */
	public static final int MINOR_FOURTEENTH = MINOR_SEVENTH + OCTAVE;
	
	/** 
	 * Twenty Three Semitones
	 */
	public static final int MAJOR_FOURTEENTH = MAJOR_SEVENTH + OCTAVE;
	
	/* Chromatic Third Octave */
	
	/** 
	 * Twenty Four Semitones
	 */
	public static final int DOUBLE_OCTAVE = OCTAVE + OCTAVE;
	
	/** 
	 * Twenty Four Semitones
	 */
	public static final int PERFECT_FIFTEENTH = DOUBLE_OCTAVE;
	
	/**
	 * Twenty Five Semitones
	 */
	public static final int MINOR_SIXTEENTH = MINOR_SECOND + DOUBLE_OCTAVE;
	
	/**
	 * Twenty Six Semitones
	 */
	public static final int MAJOR_SIXTEENTH = MAJOR_SECOND + DOUBLE_OCTAVE;
	
	/** 
	 * Twenty Seven Semitones
	 */
	public static final int MINOR_SEVENTEENTH = MINOR_THIRD + DOUBLE_OCTAVE;
			
	/** 
	 * Twenty Eight Semitones
	 */
	public static final int MAJOR_SEVENTEENTH = MAJOR_THIRD + DOUBLE_OCTAVE;
	
	/** 
	 * Twenty Nine Semitones
	 */
	public static final int PERFECT_EIGHTEENTH = PERFECT_FOURTH + DOUBLE_OCTAVE;
	
	/** 
	 * Thirty Semitones
	 */
	public static final int DIMINISHED_NINETEENTH = PERFECT_EIGHTEENTH + SHARP;
	
	/** 
	 * Thirty First Semitones
	 */
	public static final int PERFECT_NINETEENTH = PERFECT_FIFTH + DOUBLE_OCTAVE;
	
	/** 
	 * Thirty Second Semitones
	 */
	public static final int AUGMENTED_NINETEENTH = PERFECT_NINETEENTH + SHARP;
	
	/** 
	 * Thirty Third Semitones
	 */
	public static final int MAJOR_TWENTIETH = MAJOR_SIXTH + DOUBLE_OCTAVE;
	
	/** 
	 * Thirty Fourth Semitones
	 */
	public static final int MINOR_TWENTY_FIRST = MINOR_SEVENTH + DOUBLE_OCTAVE;
	
	/** 
	 * Thirty Fifth Semitones
	 */
	public static final int MAJOR_TWENTY_FIRST = MAJOR_SEVENTH + DOUBLE_OCTAVE;
	
	/* Chromatic Fourth Octave */
	
	/** 
	 * Twenty Sixth Semitones
	 */
	public static final int TRIPPLE_OCTAVE = OCTAVE + DOUBLE_OCTAVE;
	
	/** 
	 * Twenty Sixth Semitones
	 */
	public static final int PERFECT_TWENTY_SECOND = TRIPPLE_OCTAVE;
}