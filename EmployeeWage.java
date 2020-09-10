public class EmployeeWage{
	public static void main(String [] args){
		int isPresent=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		System.out.println("Empcheck"+empCheck);
		if(empCheck==isPresent){
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is Absent");
		}
	}
}
