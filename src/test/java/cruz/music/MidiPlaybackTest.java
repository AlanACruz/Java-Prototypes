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
package cruz.music;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.midi.Instrument;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import cruz.music.interval.Octave;
import cruz.music.tone.scale.Diatonic;

public class MidiPlaybackTest
{

	@Disabled("Need File Name Here")
	@Test
	public void playbackFileTest()
	{

		String fileName = "file name here";

		try
		{

			// Get the default Sequencer
			Sequencer sequencer = MidiSystem.getSequencer();

			if (sequencer == null)
			{

				System.err.println("Sequencer device not supported");
				return;
			}

			// Open device
			sequencer.open();

			// Create sequence, the File must contain MIDI file data.
			Sequence sequence = MidiSystem.getSequence(new File(fileName));

			// Load it into sequencer
			sequencer.setSequence(sequence);

			// Start the playback
			sequencer.start();

		}
		catch (MidiUnavailableException | InvalidMidiDataException | IOException ex)
		{

			ex.printStackTrace();
		}
	}

	// @Disabled("Annoying Music Alert")
	@Test
	public void playbackSynthTest()
	{

		int msPerMin  = (int) 60e3;
		int bpm       = 250;
		int msPerBeat = msPerMin / bpm;

		int initialNote     = 60;
		int initialVelocity = 50;

		try
		{

			/* Create a new Sythesizer and open it. Most of 
			 * the methods you will want to use to expand on this 
			 * example can be found in the Java documentation here: 
			 * https://docs.oracle.com/javase/7/docs/api/javax/sound/midi/Synthesizer.html
			 */
			Synthesizer midiSynth = MidiSystem.getSynthesizer();
			midiSynth.open();

			// get and load default instrument and channel lists
			Instrument[] instArray = midiSynth.getDefaultSoundbank().getInstruments();

			int i = 0;
			for (Instrument inst : instArray)
			{
				System.out.println(i + ":\t" + inst.getName());
				++i;
			}

			MidiChannel[] mChannels = midiSynth.getChannels();

			int j = 0;
			for (MidiChannel channel : mChannels)
			{
				System.out.println(j + ":\t" + channel.toString());
				++j;
			}

			// load an instrument
			// midiSynth.loadInstrument(instArray[0]);
			midiSynth.loadInstrument(instArray[222]);
			// midiSynth.getAvailableInstruments()

			int l = 0;

			Diatonic mode       = new Diatonic();
			int[]    scaleArray =
			{};

			int lenghtOfTrack = 10000;
			for (int k = 0; k < lenghtOfTrack; k++)
			{

				int modeNum = 1;

				if (0 <= l && l <= 7)
				{
					modeNum = 1;
				}
				else if (8 <= l && l <= 15)
				{
					modeNum = 5;
				}
				else if (16 <= l && l <= 23)
				{
					modeNum = 6;
				}
				else if (24 <= l && l <= 31)
				{
					modeNum = 4;
				}

				switch (modeNum)
				{
				default:
				case 1:
					scaleArray = mode.asIonian();
					break;
				case 2:
					scaleArray = mode.asDorian();
					break;
				case 3:
					scaleArray = mode.asPhrygian();
					break;
				case 4:
					scaleArray = mode.asLydian();
					break;
				case 5:
					scaleArray = mode.asMixolydian();
					break;
				case 6:
					scaleArray = mode.asAeolian();
					break;
				case 7:
					scaleArray = mode.asLocrian();
					break;
				}

				int rnd      = new Random().nextInt(scaleArray.length);
				int interval = scaleArray[rnd];
				int rndNote;

				int melodyVelocity;
				int chordVelocity;
				int bassVelocity;

				int restCutoff = 10;
				int melodyCutoff;
				int chordCutoff;
				int bassCutoff;

				int rndRest = new Random().nextInt(restCutoff);

				if (l == 0 || l == 8 || l == 16 || l == 24)
				{
					rndNote = mode.getFirst();

					melodyCutoff = restCutoff - 1;
					chordCutoff  = melodyCutoff;
					bassCutoff   = melodyCutoff;
				}
				else
				{
					rndNote = interval;

					melodyCutoff = restCutoff - 3;
					chordCutoff  = 0;
					bassCutoff   = melodyCutoff - 1;
				}

				// Melody Rest
				if (rndRest <= melodyCutoff)
				{
					melodyVelocity = initialVelocity;
				}
				else
				{
					melodyVelocity = 0;
				}

				// Bass Rest
				if (rndRest <= (bassCutoff))
				{
					bassVelocity = initialVelocity;
				}
				else
				{
					bassVelocity = 0;
				}

				// Chord Rest
				if (rndRest <= (chordCutoff))
				{
					chordVelocity = initialVelocity;
				}
				else
				{
					chordVelocity = 0;
				}

				// Melody
				mChannels[4].noteOn(initialNote + interval + rndNote + Octave.ONE, melodyVelocity);

				// Chord
				mChannels[0].noteOn(initialNote + interval + mode.getFirst(), chordVelocity);
				mChannels[1].noteOn(initialNote + interval + mode.getThird(), chordVelocity);
				mChannels[2].noteOn(initialNote + interval + mode.getFifth(), chordVelocity);
				mChannels[3].noteOn(initialNote + interval + mode.getSeventh(), chordVelocity);

				// Base Drone
				mChannels[5].noteOn(initialNote + interval + Octave.ONE_DOWN, bassVelocity);

				System.out
						.println(
								"Beat: \t" + l + "\tMode: \t" + mode.getScaleName() + "\tChord Tonic: \t" +
										(initialNote + mode.getFirst()) + "\tRandom Note: \t" + rndNote +
										"\tMelody V: \t" + melodyVelocity + "\tBass V: \t" + bassVelocity
						);

				l = l + 1;

				if (l >= 32)
				{
					l = 0;
				}

				try
				{

					// wait time in milliseconds to control duration
					Thread.sleep(msPerBeat);

				}
				catch (InterruptedException e)
				{

					e.printStackTrace();
				}

				// turn of the note
				// mChannels[0].noteOff(60);
			}

		}
		catch (MidiUnavailableException e)
		{

			e.printStackTrace();
		}
	}
}
