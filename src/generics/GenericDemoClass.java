package generics;

public class GenericDemoClass<T,K>
{
	private T value;
	private K valueK;
	
	
	public GenericDemoClass(T value)
	{
		this.value = value;
	}
	public GenericDemoClass(T value, K valueK)
	{
		this.value = value;
		this.setValueK(valueK);
	}
	
	
	
	public GenericDemoClass()
	{
		// TODO Auto-generated constructor stub
	}
	public void setValue(T value)
	{
		this.value = value;
	}
	
	public T getValue()
	{
		return this.value;
	}
	public K getValueK()
	{
		return valueK;
	}
	public void setValueK(K valueK)
	{
		this.valueK = valueK;
	}

}
