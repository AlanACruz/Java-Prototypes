package cruz.music.mode;

import java.util.ArrayList;

public class ModeList extends ArrayList<Mode>
{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	ModeList(){
		
		this.add(new Ionian());
		this.add(new Dorian());
		this.add(new Phrygian());
		this.add(new Lydian());
		this.add(new Mixolydian());
		this.add(new Aeolian());
		this.add(new Locrian());
	}
}
