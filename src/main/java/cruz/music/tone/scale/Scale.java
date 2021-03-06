package cruz.music.tone.scale;

import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public abstract class Scale {
	
	public abstract int getScaleLength();
	
	public abstract int[] getScale();
	
	public String getScaleName() {
		
		return getClass().getSimpleName();
	}
}
