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

import cruz.music.interval.Interval;
import cruz.music.interval.Octave;
import cruz.music.tone.scale.Diatonic;
import cruz.music.tone.scale.mode.Aeolian;
import cruz.music.tone.scale.mode.Dorian;
import cruz.music.tone.scale.mode.Ionian;
import cruz.music.tone.scale.mode.Locrian;
import cruz.music.tone.scale.mode.Lydian;
import cruz.music.tone.scale.mode.Mixolydian;
import cruz.music.tone.scale.mode.Phrygian;

public class MidiPlaybackTest {

	@Disabled("File Name Here")
	@Test
	public void playbackFileTest() {
		
		String fileName = "file name here";
		
        try {
        	
            Sequencer sequencer = MidiSystem.getSequencer(); // Get the default Sequencer
            
            if (sequencer==null) {
            
            	System.err.println("Sequencer device not supported");
                return;
            }
            
            // Open device
            sequencer.open(); 
            
            // Create sequence, the File must contain MIDI file data.
            Sequence sequence = MidiSystem.getSequence(new File(fileName));
            
            // load it into sequencer
            sequencer.setSequence(sequence);
            
            // start the playback
            sequencer.start();  
        
        } catch (MidiUnavailableException | InvalidMidiDataException | IOException ex) {
        	
            ex.printStackTrace();
        }
    }	
	
	@Test
	public void playbackSynthTest() {
		
		int msPerMin = (int) 60e3;
		int bpm = 250;
		int msPerBeat = msPerMin / bpm;
		
		int initialNote = 60;
		int initialVelocity = 50;
		
		try{
			    	  
			/* Create a new Sythesizer and open it. Most of 
			 * the methods you will want to use to expand on this 
			 * example can be found in the Java documentation here: 
			 * https://docs.oracle.com/javase/7/docs/api/javax/sound/midi/Synthesizer.html
			 */
			Synthesizer midiSynth = MidiSystem.getSynthesizer(); 
			midiSynth.open();
			  
			//get and load default instrument and channel lists
			Instrument[] instArray = midiSynth.getDefaultSoundbank().getInstruments();
			
			int i = 0;
			for(Instrument inst : instArray)
			{
				System.out.println(i + ":\t" + inst.getName());
				++i;
			}
			
			MidiChannel[] mChannels = midiSynth.getChannels();
			
			int j = 0;
			for(MidiChannel channel : mChannels)
			{
				System.out.println(j + ":\t" + channel.toString());
				++j;
			}
			
			//load an instrument
			//midiSynth.loadInstrument(instArray[0]);
			midiSynth.loadInstrument(instArray[222]);
			//midiSynth.getAvailableInstruments()
		  
			int l = 0;
			
			Diatonic mode = new Ionian();
			
			int lenghtOfTrack = 10000;
			for(int k = 0; k < lenghtOfTrack; k++)
			{
				
				int modeNum = 1;

				if(0 <= l && l <= 7)
				{
					modeNum = 2;
				} 
				else if(8 <= l && l <= 15)
				{
					modeNum = 6;
				} 
				else if(16 <= l && l <= 23)
				{
					modeNum = 7;
				}
				else if(24 <= l && l <= 31)
				{
					modeNum = 5;
				}
				
				switch (modeNum)
				{
					default:
					case 1:
						mode = new Ionian();
						break;
					case 2:
						mode = new Dorian();
						break;
					case 3:
						mode = new Phrygian();
						break;
					case 4:
						mode = new Lydian();
						break;
					case 5:
						mode = new Mixolydian();
						break;
					case 6:
						mode = new Aeolian();
						break;
					case 7:
						mode = new Locrian();
						break;
				}

				int[] scaleArray = mode.getScale();
				
				int rnd = new Random().nextInt(scaleArray.length);
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
				
				if(l == 0 || l == 8 || l == 16 || l == 24)
				{
					rndNote = initialNote +  Octave.ONE + mode.getFirst();
					
					melodyCutoff = restCutoff - 1;
					chordCutoff = melodyCutoff;
					bassCutoff = melodyCutoff;
				}
				else
				{
					rndNote = initialNote +  Octave.ONE + interval;
					
					melodyCutoff = restCutoff - 3;
					chordCutoff = 0;
					bassCutoff = melodyCutoff - 1;
				}
				
				
				
				// Melody Rest
				if(rndRest <= melodyCutoff) 
				{
					melodyVelocity = initialVelocity;
				}
				else
				{
					melodyVelocity = 0;
				}
				
				// Bass Rest
				if(rndRest <= (bassCutoff))
				{
					bassVelocity = initialVelocity;
				}
				else
				{
					bassVelocity = 0;
				}
				
				// Chord Rest
				if(rndRest <= (chordCutoff))
				{
					chordVelocity = initialVelocity;
				}
				else
				{
					chordVelocity = 0;
				}
				
				// Melody
				mChannels[4].noteOn(rndNote, melodyVelocity);
				
				// Chord
				mChannels[0].noteOn(initialNote + Octave.ONE_DOWN + mode.getFirst(), chordVelocity);
				mChannels[1].noteOn(initialNote + Octave.ONE_DOWN + mode.getThird(), chordVelocity);
				mChannels[2].noteOn(initialNote + Octave.ONE_DOWN + mode.getFifth(), chordVelocity);
				mChannels[3].noteOn(initialNote + Octave.ONE_DOWN + mode.getSeventh(), chordVelocity);

				// Base Drone
				mChannels[5].noteOn(initialNote + Octave.TWO_DOWN + mode.getSeventh(), bassVelocity);
				
				
				
				System.out.println(
						"Beat: \t" + l + 
						"\tMode: \t" + mode.getRelativeTonicString() + 
						"\tChord Tonic: \t" + (initialNote + mode.getFirst()) +
						"\tRandom Note: \t" + rndNote +
						"\tMelody V: \t" + melodyVelocity +
						"\tBass V: \t" + bassVelocity
						);
				
				l = l + 1;
				
				if(l >= 32)
				{
					l = 0;
				}
				
			  
				try { 
					
					// wait time in milliseconds to control duration
					Thread.sleep(msPerBeat); 
				  
				} catch( InterruptedException e ) {
				      
					e.printStackTrace();
				}
				
				//turn of the note
				//mChannels[0].noteOff(60); 
			}
		  
		} catch (MidiUnavailableException e) {
		    	
			e.printStackTrace();
		}
	}
}
