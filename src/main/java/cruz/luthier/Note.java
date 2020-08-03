package cruz.luthier;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

/**
 * @author CruzA
 */
@AllArgsConstructor
public class Note
{
	private LetterNames letterName;
	private Octaves     octave;

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
		int midiOffset = 12;
		return MidiPitchNotation.getMidiNoteNumber(letterName, octave) - midiOffset;
	}
}
