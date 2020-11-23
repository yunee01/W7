public class ShiftSupervisor extends Employee
{
	private double salary;
	private double annBonus;

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public void setAnnBonus(double annBonus)
	{
		this.annBonus = annBonus;
	}

	public double getSalary()
	{
		return salary*12;
	}

	public double getAnnBonus()
	{
		return annBonus;
	}

	public String toString()
	{
		return super.toString() +
		"\nSalary : RM " + salary +  
		"\nAnnual Salary : RM " + getSalary() +
		"\nAnnual Bonus : RM " + getAnnBonus() + 
		"\nTotal Amount : RM " + (getSalary() + getAnnBonus());
	}
}