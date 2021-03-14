package cruz.core;

/*-
 * #%L
 * CS-7700
 * %%
 * Copyright (C) 2020 Alan Cruz
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

public abstract class DtoTypeOf<E extends EntityTypeOf<?>> implements Jacksonable, ConvertibleToEntity<E>
{
	private final Class<?> runtimeType;

	public <D extends DtoTypeOf<?>> DtoTypeOf()
	{
		this.runtimeType = this.getRuntimeType();
	}

	@SuppressWarnings("unchecked")
	public <D extends DtoTypeOf<?>> Class<D> getRuntimeType()
	{
		return (Class<D>) this.runtimeType;
	}

	@Override
	public String toString()
	{
		return this.toJacksonString();
	}
}
