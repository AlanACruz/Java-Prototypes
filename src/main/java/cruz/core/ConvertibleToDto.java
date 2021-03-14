package cruz.core;

public interface ConvertibleToDto<D extends DtoTypeOf<?>>
{
	public D toDtoType();
}
