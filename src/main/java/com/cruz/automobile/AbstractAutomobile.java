/**
 * Copyright (c) 2019 Alan Cruz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.cruz.automobile;

import java.io.Serializable;

import com.cruz.automobile.engine.Engine;
import com.cruz.automobile.tire.Tire;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TODO Auto-generated Comment
 */
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class AbstractAutomobile implements Serializable
{
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = -1974739912725011134L;

	/**
	 * Engine theEngine
	 */
	private Engine theEngine;

	/**
	 * Tire frontLeft
	 */
	private Tire frontLeft;

	/**
	 * Tire frontRight
	 */
	private Tire frontRight;

	/**
	 * Tire backLeft
	 */
	private Tire backLeft;

	/**
	 * Tire backRight
	 */
	private Tire backRight;
}
