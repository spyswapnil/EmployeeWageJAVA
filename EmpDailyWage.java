public class EmpDailyWage{
	public static void main(String [] args){
		final int isfulltime=1;
		final int isparttime=2;
		final int emp_rate=20;
		int totalDays=0;
		int empHrs;
		int empWage=0;
		int totalWage=0;
		while(totalDays<=20){
			int empCheck= (int) Math.floor(Math.random()*10)%3;
			switch(empCheck){
				case isfulltime:
					System.out.println("Employee is Present");
					empHrs=8;
				break;
				case isparttime:
					System.out.println("Half Day");
					empHrs=4;
				break;
				default:
					System.out.println("Employee is Absent");
					empHrs=0;
				break;
			}
			empWage=empHrs*emp_rate;
			totalWage=empWage+totalWage;
			totalDays++;
		}
		System.out.println("Total Employee Wage:="+totalWage);

	}
}
