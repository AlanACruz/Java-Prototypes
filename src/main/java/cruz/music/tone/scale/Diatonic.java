/*******************************************************************************
 * Copyright (C) 2021 Alan Cruz
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package cruz.music.tone.scale;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Diatonic Interval:	1	2	3	4	5	6	7	8
 * Diatonic Steps:		R	1	1	½	1	1	1	½
 * Semitone Interval:	0	2	4	5	7	9	11	12
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class Diatonic extends Scale {
	
	private final int scaleLength = 7;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.FOUR;
	private final int fourth = Semitone.FIVE;
	private final int fifth = Semitone.SEVEN;
	private final int sixth = Semitone.NINE;
	private final int seventh = Semitone.ELEVEN;
	
	/**
	 * Return all tones in an Ionian mode (I).
	 * 
	 * @return scale array
	 */
	public int[] getIonian() {

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
	
	/**
	 * Return all tones in a Dorian mode (ii).
	 * 
	 * @return scale array
	 */
	public int[] getDorian() {

		int modeOffset = getSecond();
		
		return new int[] {
				
			getSecond() - modeOffset,
			getThird() - modeOffset,
			getFourth() - modeOffset,
			getFifth() - modeOffset,
			getSixth() - modeOffset,
			getSeventh() - modeOffset,
			getFirst() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a Phrygian mode (iii).
	 * 
	 * @return scale array
	 */
	public int[] getPhrygian() {

		int modeOffset = getThird();
		
		return new int[] {
				
			getThird() - modeOffset,
			getFourth() - modeOffset,
			getFifth() - modeOffset,
			getSixth() - modeOffset,
			getSeventh() - modeOffset,
			getFirst() - modeOffset + Octave.ONE,
			getSecond() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a Lydian mode (IV).
	 * 
	 * @return scale array
	 */
	public int[] getLydian() {

		int modeOffset = getFourth();
		
		return new int[] {
				
			getFourth() - modeOffset,
			getFifth() - modeOffset,
			getSixth() - modeOffset,
			getSeventh() - modeOffset,
			getFirst() - modeOffset + Octave.ONE,
			getSecond() - modeOffset + Octave.ONE,
			getThird() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a Mixolydian mode (V).
	 * 
	 * @return scale array
	 */
	public int[] getMixolydian() {

		int modeOffset = getFifth();
		
		return new int[] {
				
			getFifth() - modeOffset,
			getSixth() - modeOffset,
			getSeventh() - modeOffset,
			getFirst() - modeOffset + Octave.ONE,
			getSecond() - modeOffset + Octave.ONE,
			getThird() - modeOffset + Octave.ONE,
			getFourth() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a Aeolian mode (vi).
	 * 
	 * @return scale array
	 */
	public int[] getAeolian() {

		int modeOffset = getSixth();
		
		return new int[] {

			getSixth() - modeOffset,
			getSeventh() - modeOffset,
			getFirst() - modeOffset + Octave.ONE,
			getSecond() - modeOffset + Octave.ONE,
			getThird() - modeOffset + Octave.ONE,
			getFourth() - modeOffset + Octave.ONE,
			getFifth() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a Locrian mode (vii).
	 * 
	 * @return scale array
	 */
	public int[] getLocrian() {

		int modeOffset = getSeventh();
		
		return new int[] {

			getSeventh() - modeOffset,
			getFirst() - modeOffset + Octave.ONE,
			getSecond() - modeOffset + Octave.ONE,
			getThird() - modeOffset + Octave.ONE,
			getFourth() - modeOffset + Octave.ONE,
			getFifth() - modeOffset + Octave.ONE,
			getSixth() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a major scale.
	 * 
	 * @return scale array
	 */
	public int[] getMajor() {

		return getIonian();
	}
	
	/**
	 * Return all tones in a minor scale.
	 * 
	 * @return scale array
	 */
	public int[] getMinor() {

		return getAeolian();
	}
	
	/**
	 * Return all tones in a scale.
	 * 
	 * @return scale array
	 */
	public int[] getScale() {

		return getMajor();
	}
}
