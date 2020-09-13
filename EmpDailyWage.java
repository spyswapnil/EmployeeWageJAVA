public class EmpDailyWage{
	final int isfulltime=1;
	final int isparttime=2;
	int empHrs=0;

	public int calculator(String company,int emp_rate,int totalDays,int totalHours){
		int empWage=0, totalworkingdays=0, totalWage=0, totalworkinghours=0;
		System.out.println("For Company:"+company+" with "+emp_rate+" per day");
		while(totalworkingdays<totalDays && totalworkinghours<totalHours){
			totalworkingdays++;
			int empCheck= (int) Math.floor(Math.random()*10)%3;
			empStatus(empCheck);
			totalworkinghours+=empHrs;
			empWage=emp_rate*empHrs;
			totalWage+=empWage;
		}
		System.out.println(totalWage);
		return totalWage;
	}

	public int empStatus(int empCheck){
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
		return empHrs;
	}

	public static void main(String [] args){
		EmpDailyWage edw=new EmpDailyWage();
		edw.calculator("DMart",20,5,35);
		edw.calculator("Reliance",30,8,55);
	}
}
