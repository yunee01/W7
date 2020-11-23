public class TeamLeader extends ProductionWorker
{
	private static final int requiredHours = 45;
	private double monthlyBonus;
	private int trainHours;

	public TeamLeader(int shift, double rate, int trainHours, double monthlyBonus)
	{
		super(shift,rate);
		this.trainHours = trainHours;
		this.monthlyBonus = monthlyBonus;
	}

	public double getMonthlyBonus()
	{
		return monthlyBonus;
	}

	public int getTrainHours()
	{
		return trainHours;
	}

	public String hoursRequirement()
	{

		if (trainHours>=0 && trainHours<45)
			return "\nNot fulfilled minimum training hours. Train more."; 
		else
			return "\nMinimum training hours is fulfilled."; 
	}

	public String toString()
	{
		return super.toString() + 
		"\nMonthly Bonus : RM " + getMonthlyBonus() + 
		"\nTraining Hours : " + getTrainHours() + " hours/year" + 
		hoursRequirement();
		
	}



}