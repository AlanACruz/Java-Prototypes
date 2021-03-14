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

public abstract class EntityTypeOf<D extends DtoTypeOf<?>> implements Jacksonable, ConvertibleToDto<D>
{
	private final Class<?> runtimeType;

	public EntityTypeOf()
	{
		this.runtimeType = this.getRuntimeType();
	}

	@SuppressWarnings("unchecked")
	public <E extends EntityTypeOf<?>> Class<E> getRuntimeType()
	{
		return (Class<E>) this.runtimeType;
	}

	@Override
	public String toString()
	{
		return this.toJacksonString();
	}
}
