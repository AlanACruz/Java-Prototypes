package cruz.core;

public interface RuntimeTypable<T>
{
	@SuppressWarnings("unchecked")
	public default Class<T> getRuntimeType()
	{
		return (Class<T>) this.runtimeType();
	}

	public T runtimeType();
}
