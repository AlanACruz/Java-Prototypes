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
 * 
 * Scale Position:		1	2	3	4	5	6	7	8	9	10	11	12
 * 
 * Diatonic Interval:	1	2	♭3	3	5	6	8	9	♭10	10	13	15
 * Scale Interval:		1	2	3	4	5	6	7	8	9	10	11	12
 * Wholetone Steps:		R	1	½	½	1½	1	1½	1	½	½	1½	1
 * Semitone Interval:	0	2	3	4	7	9	12	14	15	16	19	24
 * Semitone Steps:		0	2	1	1	3	2	3	2	1	1	3	3
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class Blues extends Scale {
	
	private final int scaleLength = 6;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.THREE;
	private final int fourth = Semitone.FOUR;
	private final int fifth = Semitone.SEVEN;
	private final int sixth = Semitone.NINE;
	
	/**
	 * Return all tones in a major blues scale.
	 * 
	 * Scale Position:		1	2	3	4	5	6	7
	 * 
	 * Diatonic Interval:	1	2	♭3	3	5	6	8
	 * Wholetone Steps:		R	1	½	½	1½	1	1½
	 * Semitone Interval:	0	2	3	4	7	9	12
	 * Semitone Steps:		0	2	1	1	3	2	3
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
				getSixth()
		};
	}
	
	/**
	 * Return all tones in a minor blues scale.
	 * 
	 * Scale Position:		1	2	3	4	5	6	7
	 * 
	 * Diatonic Interval:	6	8	9	♭10	10	12	13
	 * Wholetone Steps:		R	1½	1	½	½	1½	1
	 * Semitone Interval:	9	12	14	15	16	19	21
	 * Semitone Steps:		0	3	2	1	1	3	2
	 * 
	 * @return scale array
	 */
	public int[] asMinor() {

		int modeOffset = getSixth();
		
		return new int[] {

			getSixth() - modeOffset,
			getFirst() - modeOffset + Octave.ONE,
			getSecond() - modeOffset + Octave.ONE,
			getThird() - modeOffset + Octave.ONE,
			getFourth() - modeOffset + Octave.ONE,
			getFifth() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a minor blues scale.
	 * 
	 * @return scale array
	 */
	public int[] asScale() {

		return asMajor();
	}
}
