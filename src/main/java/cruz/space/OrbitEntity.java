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
package cruz.space;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import cruz.core.EntityTypeOf;
import cruz.vector.CartesianThreeEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode( callSuper = false )
public class OrbitEntity extends EntityTypeOf< OrbitDto >
{
	@Id
	private long id;

	// Timestamp only allows for 0 to 6 percision, to get 9 I need a custom class
	// https://www.postgresql.org/docs/9.1/datatype-datetime.html
	@Column( columnDefinition = "TIMESTAMP(9) WITH TIME ZOME" )
	private final ZonedDateTime timestamp;

	@OneToOne
	private final CartesianThreeEntity position;

	@OneToOne
	private final CartesianThreeEntity velocity;

	@OneToOne
	private final CartesianThreeEntity acceleration;

	@Override
	public OrbitDto toDtoType()
	{
		return new OrbitDto( timestamp, position, velocity, acceleration );
	}
}
