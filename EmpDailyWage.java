public class EmpDailyWage{
       	public static final int isfulltime=1;
        public static final int isparttime=2;
        private int empHrs=0;
	private final int emp_rate,totalDays,totalHours;
	private String company;

	EmpDailyWage(String company,int emp_rate,int totalDays,int totalHours){
		this.emp_rate=emp_rate;
		this.totalDays=totalDays;
		this.totalHours=totalHours;
		this.company=company;
	}

        public int calculator(){
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
                System.out.println("Total Wage for an employee per month="+totalWage);
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
                EmpDailyWage dmart=new EmpDailyWage("DMart",20,5,35);
		EmpDailyWage reliance=new EmpDailyWage("Reliance",30,8,55);
                dmart.calculator();
                reliance.calculator();
        }
}
