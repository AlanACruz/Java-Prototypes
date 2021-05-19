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
package cruz.automobile;

import org.springframework.stereotype.Component;

import cruz.automobile.engine.Engine;
import cruz.automobile.tire.Tire;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * TODO Auto-generated Comment
 */
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Component
public class Car extends AbstractAutomobile
{
	/**
	 * @param theEngine
	 * @param frontLeft
	 * @param frontRight
	 * @param backLeft
	 * @param backRight
	 */
	@Builder
	public Car(
			@NonNull Engine theEngine,
			@NonNull Tire frontLeft,
			@NonNull Tire frontRight,
			@NonNull Tire backLeft,
			@NonNull Tire backRight
	)
	{
		super(theEngine, frontLeft, frontRight, backLeft, backRight);
	}

	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = -4093608498144878677L;
	
	/**
	 * Just checking if static code analysis catches this.
	 */
	public boolean obviousStringEqualBug(){
	
		String a = "a";
		String b = "b";
		
		if ( a == b ) {
		
			return false;
		}
		
		if ( a.equals(b) ) {
		
			return true
		}
		
		return false;
	}
}
