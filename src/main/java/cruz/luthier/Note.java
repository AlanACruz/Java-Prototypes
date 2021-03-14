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
package cruz.luthier;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

/**
 * @author CruzA
 */
@AllArgsConstructor
public class Note
{
	private int letterName;
	private int octave;

	/**
	 * Formula 1 : k is the fret number f-sub(0) = f-naught = open string = 0th fret
	 *
	 * @implSpec f-sub(k) = r^(k) * f-sub(0)
	 *
	 * @return
	 */
	public BigDecimal getFreqHz()
	{
		int        k        = this.getIntdexNumber();
		BigDecimal r        = LuthierConstants.R;
		BigDecimal baseFreq = A440.C0.getPitchFreqHz();

		return (r.pow(k)).multiply(baseFreq);
	}

	/**
	 * @return
	 */
	public int getIntdexNumber()
	{
		return letterName + octave;
	}
}
