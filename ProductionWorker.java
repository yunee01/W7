public class ProductionWorker extends Employee
{
	private int shift;
	private double rate;

	public ProductionWorker(){}

	public ProductionWorker(int shift, double rate)
	{
		this.shift = shift;
		this.rate = rate;
	}	
	
	public String getShift()
	{
		if (shift==1)
			return "Day";
		else if (shift==2)
			return "Night";
		else 
			return "Invalid";
	}

	public double pay(int hour)
	{
		return hour * rate;
	}

	public String toString()
	{
		return super.toString() + 
		"\nShift : " + getShift() +
		"\nPay is RM ";
	}
}