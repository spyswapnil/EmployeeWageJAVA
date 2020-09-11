public class EmpWage{
	public static void main(String [] args){
		final int isfulltime=1;
		final int emp_rate=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==isfulltime){
			System.out.println("Employee is Present");
			empHrs=8;
		}
		else{
			System.out.println("Employee is Absent");
		}
		empWage=empHrs*emp_rate;
		System.out.println("Employee Wage:="+empWage);
	}
}
