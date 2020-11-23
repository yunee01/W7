public class Employee
{
	private String name;
	private String empNumber;
	private String hireDate;

	public Employee(){}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmpNumber(String empNumber)
	{
		this.empNumber = empNumber;
	}

	public void setDate(String hireDate)
	{
		this.hireDate = hireDate;
	}

	public String setName()
	{
		return name;
	}


	public String toString()
	{
		return "\nName : " + name + 
		"\nEmployee Number : " + empNumber +
		"\nHired Date : " + hireDate;
	}
}