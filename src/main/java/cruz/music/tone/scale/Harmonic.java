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
 * Scale Position:		1	2	3	4	5	6	7	8	9	10	11	12	13	14	15
 * 
 * Common:									1	2	♭3	4	5	♭6	7	8
 * Diatonic Interval:	1	2	3	4	♯5	6	7	8	9	10	11	♯12	13	14	15
 * Wholetone Steps:		0	1	1	½	1½	½	1	½	1	1	½	1½	½	1	½	
 * Semitone Steps:		0	2	2	1	3	1	2	1	2	2	1	3	1	2	1
 * Semitone Interval:	0	2	4	5	8	9	11	12	14	16	17	20	21	23	24
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class Harmonic extends Scale {
	
	private final int scaleLength = 7;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.FOUR;
	private final int fourth = Semitone.FIVE;
	private final int fifth = Semitone.EIGHT;
	private final int sixth = Semitone.NINE;
	private final int seventh = Semitone.ELEVEN;

	/**
	 * Scale Position:		1	2	3	4	5	6	7	8
	 * 
	 * Diatonic Interval:	1	2	3	4	♯5	6	7	8
	 * Wholetone Steps:		0	1	1	½	1½	½	1	½
	 * Semitone Steps:		0	2	2	1	3	1	2	1
	 * Semitone Interval:	0	2	4	5	8	9	11	12
 	 *
	 * @return scale array
	 */
	public int[] asSemitoneZero() {

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
	 * Scale Position:		1	2	3	4	5	6	7	8
	 * 
	 * Diatonic Interval:	2	3	4	♯5	6	7	8	9
	 * Wholetone Steps:		0	1	½	1½	½	1	½	1
	 * Semitone Steps:		0	2	1	3	1	2	1	2
	 * Semitone Interval:	2	4	5	8	9	11	12	14
 	 *
	 * @return scale array
	 */
	public int[] asSemitoneTwo() {

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
	 * Scale Position:		1	2	3	4	5	6	7	8
	 * 
	 * Diatonic Interval:	3	4	♯5	6	7	8	9	10
	 * Wholetone Steps:		0	½	1½	½	1	½	1	1
	 * Semitone Steps:		0	1	3	1	2	1	2	2
	 * Semitone Interval:	4	5	8	9	11	12	14	16
 	 *
	 * @return scale array
	 */
	public int[] asSemitoneFour() {

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
	 * Scale Position:		1	2	3	4	5	6	7	8
	 * 
	 * Diatonic Interval:	4	♯5	6	7	8	9	10	11
	 * Wholetone Steps:		0	1½	½	1	½	1	1	½
	 * Semitone Steps:		0	3	1	2	1	2	2	1
	 * Semitone Interval:	5	8	9	11	12	14	16	17
 	 *
	 * @return scale array
	 */
	public int[] asSemitoneFive() {

		int modeOffset = getFourth();
		
		return new int[] {
				
				getFourth() - modeOffset,				
				getFifth() - modeOffset,
				getSixth() - modeOffset,
				getSeventh() - modeOffset,
				getFirst() - modeOffset + Octave.ONE,
				getSecond() - modeOffset + Octave.ONE,
				getThird() - modeOffset	+ Octave.ONE			
		};
	}
	/**
	 * Scale Position:		1	2	3	4	5	6	7	8
	 * 
	 * Diatonic Interval:	♯5	6	7	8	9	10	11	♯12
	 * Wholetone Steps:		0	½	1	½	1	1	½	1½
	 * Semitone Steps:		0	1	2	1	2	2	1	3
	 * Semitone Interval:	8	9	11	12	14	16	17	20
 	 *
	 * @return scale array
	 */
	public int[] asSemitoneEight() {

		int modeOffset = getFifth();
		
		return new int[] {
				
				getFifth() - modeOffset,
				getSixth() - modeOffset,
				getSeventh() - modeOffset,
				getFirst() - modeOffset + Octave.ONE,
				getSecond() - modeOffset + Octave.ONE,
				getThird() - modeOffset + Octave.ONE,
				getFourth() - modeOffset + Octave.ONE,
		};
	}
	
	/**
	 * Scale Position:		1	2	3	4	5	6	7	8
	 * 
	 * Diatonic Interval:	6	7	8	9	10	11	♯12	13
	 * Wholetone Steps:		0	1	½	1	1	½	1½	½
	 * Semitone Steps:		0	2	1	2	2	1	3	1
	 * Semitone Interval:	9	11	12	14	16	17	20	21
	 * 
	 * @return scale array
	 */
	public int[] asSemitoneNine() {

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
	 * Scale Position:		1	2	3	4	5	6	7	8
	 * 
	 * Diatonic Interval:	7	8	9	10	11	♯12	13	14
	 * Wholetone Steps:		0	½	1	1	½	1½	½	1
	 * Semitone Steps:		0	1	2	2	1	3	1	2
	 * Semitone Interval:	11	12	14	16	17	20	21	23
 	 *
	 * @return scale array
	 */
	public int[] asSemitoneEleven() {

		int modeOffset = getSeventh();
		
		return new int[] {
				
				getSeventh() - modeOffset,
				getFirst() - modeOffset + Octave.ONE,
				getSecond() - modeOffset + Octave.ONE,
				getThird() - modeOffset + Octave.ONE,
				getFourth() - modeOffset + Octave.ONE,
				getFifth() - modeOffset + Octave.ONE,
				getSixth() - modeOffset + Octave.ONE,
		};
	}
	
	/**
	 * Return all tones in a major scale.
	 * 
	 * @return scale array
	 */
	public int[] asMajor() {

		return asSemitoneZero();
	}
	
	/**
	 * Return all tones in a minor scale.
	 * 
	 * @return scale array
	 */
	public int[] asMinor() {

		return asSemitoneNine();
	}
	
	/**
	 * Return all tones in a minor scale.
	 * 
	 * @return scale array
	 */
	public int[] asScale() {

		return asMinor();
	}
}
