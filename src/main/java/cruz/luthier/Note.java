package cruz.luthier;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

/**
 * @author CruzA
 */
@AllArgsConstructor
public class Note
{
	LetterNames letterName;
	Octaves     octave;

	public BigDecimal getFreqHz()
	{
		int midiNumber = this.getMidiNumber();
		int midiOffset = 12;

		BigDecimal R = LuthierConstants.findR();

		return null;
	}

	/**
	 * @return
	 */
	public int getMidiNumber()
	{
		return MidiPitchNotation.getMidiNoteNumber(letterName, octave);
	}
}
