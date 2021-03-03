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

import cruz.music.interval.IntervalConstants;

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
		int bpm = 60;
		int msPerBeat = msPerMin / bpm;
		
		int initialNote = 60;
		int initialVelocity = 100;
		
		int[] scaleArray = {
				IntervalConstants.PERFECT_UNITY,
//				IntervalList.MINOR_SECOND,
				IntervalConstants.MAJOR_SECOND,
//				IntervalList.MINOR_THIRD,
				IntervalConstants.MAJOR_THIRD,
				IntervalConstants.PERFECT_FOURTH,
//				IntervalList.DIMINISHED_FIFTH,
				IntervalConstants.PERFECT_FIFTH,
//				IntervalList.AUGMENTED_FIFTH,
				IntervalConstants.MAJOR_SIXTH //,
//				IntervalList.MINOR_SEVENTH,
//				IntervalList.MAJOR_SEVENTH
		};
		
		
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
			
			for(int k = 0; k < 1000; k++)
			{								
				int rnd = new Random().nextInt(scaleArray.length);
				int interval = scaleArray[rnd];
				
				int rndNote = initialNote + interval;
				
				//On channel 0, play note number 60 with velocity 100 
				//mChannels[0].noteOn(initialNote - 12 , initialVelocity/2);
				if(l == 0 || l == 1 || l == 2 || l == 3 )
				{
					mChannels[1].noteOn(initialNote + (-12), initialVelocity);
					mChannels[2].noteOn(initialNote + (-12 + 7), initialVelocity);
					l = l + 1;	
				} 
				else  if(l == 4 || l == 5 || l == 6 || l == 7 )
				{
					mChannels[1].noteOn(initialNote + (-12 + 7), initialVelocity);
					mChannels[2].noteOn(initialNote + (-12 + 7 + 7), initialVelocity);
					l = l + 1;
				} 
				else if(l == 8 || l == 9 || l == 10 || l == 11 )
				{
					mChannels[1].noteOn(initialNote + (-12 + 9), initialVelocity);
					mChannels[2].noteOn(initialNote + (-12 + 9 + 7), initialVelocity);
					l = l + 1;
				}
				else if(l == 12 || l == 13 || l == 14 || l == 15 )
				{
					mChannels[1].noteOn(initialNote + (-12 + 5), initialVelocity);
					mChannels[2].noteOn(initialNote + (-12 + 5 + 7), initialVelocity);
					l = l + 1;;
				}
				
				if(l == 16)
				{
					l = 0;
				}
				
				mChannels[4].noteOn(rndNote + 12, initialVelocity);
				
			  
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
