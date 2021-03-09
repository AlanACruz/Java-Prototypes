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
 * Scale Position:		1	2	3	4	5	6	7	8	9	10	11
 * 	
 * Diatonic Interval:	1	2	3	5	6	8	9 	10	12	13	15
 * Wholetone Steps:		0	1	1	1½	1	1½	1	1	1½	1	1½
 * Semitone Steps:		0	2	2	3	2	3	2	2	3	2	3
 * Semitone Interval:	0	2	4	7	9	12	14	16	19	21	24
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class Pentatonic extends Scale {
	
	private final int scaleLength = 5;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.FOUR;
	private final int fourth = Semitone.SEVEN;
	private final int fifth = Semitone.NINE;
	
	/**
	 * Return all tones in a major scale.
	 * 
	 * Scale Position:		1	2	3	4	5	6
	 * 
	 * Diatonic Interval:	1	2	3	5	6	8
	 * Wholetone Steps:		0	1	1	1½	1	1½
	 * Semitone Steps:		0	2	2	3	2	3
	 * Semitone Interval:	0	2	4	7	9	12
	 * 
	 * @return scale array
	 */
	public int[] asMajor() {

		return new int[] {
				getFirst(),
				getSecond(),
				getThird(),
				getFourth(),
				getFifth(),
		};
	}
	
	/**
	 * Return all tones in a minor scale.
	 * 
	 * Scale Position:		1	2	3	4	5	6
	 * 
	 * Diatonic Interval:	6	8	9	10	12	13
	 * Wholetone Steps:		0	1½	1	1	1½	1
	 * Semitone Steps:		0	3	2	2	3	2
	 * Semitone Interval:	9	12	14	16	19	21
	 * 
	 * @return scale array
	 */
	public int[] asMinor() {

		int modeOffset = getFifth();
		
		return new int[] {
				getFifth() - modeOffset,
				getFirst() - modeOffset + Octave.ONE,
				getSecond() - modeOffset + Octave.ONE,
				getThird() - modeOffset + Octave.ONE,
				getFourth() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a scale.
	 * 
	 * @return scale array
	 */
	public int[] asScale() {

		return asMinor();
	}
}
