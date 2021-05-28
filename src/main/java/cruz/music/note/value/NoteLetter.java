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

/**
 * @author CruzA
 */
public class NoteLetter
{
	public static final String C              = "C ";
	public static final String C_SHARP_D_FLAT = "C#";
	public static final String D              = "D ";
	public static final String D_SHARP_E_FLAT = "D#";
	public static final String E              = "E ";
	public static final String F              = "F ";
	public static final String F_SHARP_G_FLAT = "F#";
	public static final String G              = "G ";
	public static final String G_SHARP_A_FLAT = "G#";
	public static final String A              = "A ";
	public static final String A_SHARP_B_FLAT = "A#";
	public static final String B              = "B ";

	public static String getNoteLetterFromNoteNumber( int note )
	{
		if ( note < 0 )
		{
			throw new IllegalArgumentException();
		}

		String[] NoteLettersArray =
		{
			NoteLetter.C, NoteLetter.C_SHARP_D_FLAT, NoteLetter.D, NoteLetter.D_SHARP_E_FLAT, NoteLetter.E,
			NoteLetter.F, NoteLetter.F_SHARP_G_FLAT, NoteLetter.G, NoteLetter.G_SHARP_A_FLAT, NoteLetter.A,
			NoteLetter.A_SHARP_B_FLAT, NoteLetter.B
		};

		int reducedNote = note % 12;

		return NoteLettersArray[ reducedNote ];
	}
}
