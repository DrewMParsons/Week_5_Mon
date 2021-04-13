package fileWithListsExample;

public class Course
{
	String code, name, instructor;

	public Course(String code, String name, String instructor)
	{
		super();
		this.code = code;
		this.name = name;
		this.instructor = instructor;
	}

	protected String getCode()
	{
		return code;
	}

	protected void setCode(String code)
	{
		this.code = code;
	}

	protected String getName()
	{
		return name;
	}

	protected void setName(String name)
	{
		this.name = name;
	}

	protected String getInstructor()
	{
		return instructor;
	}

	protected void setInstructor(String instructor)
	{
		this.instructor = instructor;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (code == null)
		{
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (instructor == null)
		{
			if (other.instructor != null)
				return false;
		} else if (!instructor.equals(other.instructor))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
