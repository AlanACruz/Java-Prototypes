package cruz.core;

public interface ConvertibleToEntity<E extends EntityTypeOf<?>>
{
	public E toEntityType();
}
