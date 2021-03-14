package cruz.space;

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

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import cruz.core.DtoTypeOf;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode(callSuper = false)
public class SpacecraftStateDto extends DtoTypeOf<SpacecraftStateEntity>
{
	@Id
	private long id;

	private final long orbitId;

	private final BigDecimal massKg;

	@Override
	public SpacecraftStateEntity toEntityType()
	{
		return new SpacecraftStateEntity(orbitId, massKg);
	}
}
