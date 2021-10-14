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
package cruz.music.note.value;

import cruz.music.interval.Semitone;

/**
 * @author CruzA
 */
public class NoteNumbers
{
	public static final int C              = Semitone.ZERO;
	public static final int C_SHARP_D_FLAT = Semitone.ONE;
	public static final int D              = Semitone.TWO;
	public static final int D_SHARP_E_FLAT = Semitone.THREE;
	public static final int E              = Semitone.FOUR;
	public static final int F              = Semitone.FIVE;
	public static final int F_SHARP_G_FLAT = Semitone.SIX;
	public static final int G              = Semitone.SEVEN;
	public static final int G_SHARP_A_FLAT = Semitone.EIGHT;
	public static final int A              = Semitone.NINE;
	public static final int A_SHARP_B_FLAT = Semitone.TEN;
	public static final int B              = Semitone.ELEVEN;

	public static int getNoteNumberFromNoteString(String note)
	{
		switch (note)
		{
		case NoteLetter.C:
			return NoteNumbers.C;

		case NoteLetter.C_SHARP_D_FLAT:
			return NoteNumbers.C_SHARP_D_FLAT;

		case NoteLetter.D:
			return NoteNumbers.D;

		case NoteLetter.D_SHARP_E_FLAT:
			return NoteNumbers.D_SHARP_E_FLAT;

		case NoteLetter.E:
			return NoteNumbers.E;

		case NoteLetter.F:
			return NoteNumbers.F;

		case NoteLetter.F_SHARP_G_FLAT:
			return NoteNumbers.F_SHARP_G_FLAT;

		case NoteLetter.G:
			return NoteNumbers.G;

		case NoteLetter.G_SHARP_A_FLAT:
			return NoteNumbers.G_SHARP_A_FLAT;

		case NoteLetter.A:
			return NoteNumbers.A;

		case NoteLetter.A_SHARP_B_FLAT:
			return NoteNumbers.A_SHARP_B_FLAT;

		case NoteLetter.B:
			return NoteNumbers.B;

		default:
			throw new IllegalArgumentException("Note name does not have match.");
		}
	}
	
	public static int[] getNoteNumberListFromNoteStringList(String[] noteList)
	{
		int[] returnList = new int[noteList.length];

		int i = 0;
		for(String note : noteList)
		{
			returnList[i] = getNoteNumberFromNoteString(note);
		}

		return returnList;
	}
}
