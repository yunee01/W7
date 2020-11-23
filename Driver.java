public class Driver
{
	public static void main(String[] args)
	{
		ProductionWorker pw1 = new ProductionWorker(2, 7.5); 
		pw1.setName("John");
		pw1.setEmpNumber("511-P");
		pw1.setDate("8/8/2020");
		System.out.println(pw1 + "" + pw1.pay(40));

		ShiftSupervisor sv1 = new ShiftSupervisor();
		sv1.setName("Zalina");
		sv1.setEmpNumber("333-S");
		sv1.setDate("20/5/2016");
		sv1.setSalary(6000);
		sv1.setAnnBonus(1000);
		System.out.println(sv1);

		TeamLeader tl1= new TeamLeader(1, 6.5, 23, 500);
		tl1.setName("Lee");
		tl1.setEmpNumber("123-L");
		tl1.setDate("31/8/2018");
		System.out.println(tl1);



	}
}