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

import cruz.music.interval.Semitone;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Diatonic Interval:	1	2	♭3	4	5	♭6	7	8	9	♭10	11	12	♭13	14	15
 * Scale Interval:		1	2	3	4	5	6	7	8	9	10	11	12	13	14	15
 * Wholetone Steps:		R	1	½	1	1	½	1½	½	1	½	1	1	½	1½	½	
 * Semitone Interval:	0	2	3	5	7	8	11	12	14	15	17	19	20	23	24
 * Semitone Steps:		0	2	1	2	2	1	3	1	2	1	2	2	1	3	1
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class HarmonicMinor extends Scale {
	
	private final int scaleLength = 7;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.THREE;
	private final int fourth = Semitone.FIVE;
	private final int fifth = Semitone.SEVEN;
	private final int sixth = Semitone.EIGHT;
	private final int seventh = Semitone.ELEVEN;

	/**
	 * Return all tones in a scale.
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
