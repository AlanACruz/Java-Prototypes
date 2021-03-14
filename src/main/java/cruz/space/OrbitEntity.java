package cruz.space;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import cruz.core.EntityTypeOf;
import cruz.vector.CartesianThreeEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode(callSuper = false)
public class OrbitEntity extends EntityTypeOf<OrbitDto>
{
	@Id
	private long id;

	private final ZonedDateTime timestamp;

	private final CartesianThreeEntity position;

	private final CartesianThreeEntity velocity;

	private final CartesianThreeEntity acceleration;

	@Override
	public OrbitDto toDtoType()
	{
		return new OrbitDto(timestamp, position, velocity, acceleration);
	}
}
