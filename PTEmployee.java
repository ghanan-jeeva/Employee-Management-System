
public class PTEmployee extends EmployeeInfo {
	
	protected double hourlyWage;
	protected int hoursPerWeek;
	protected int weeksPerYear;
	
	
        public void PTEmployee(int num, String fN, String lN, int gender, int workL, double dR, double hourlyWage, int hoursPerWeek, int weeksPerYear){
            super(num, fN, lN, gender, workL, dR);
            this.hourlyWage = hourlyWage;
            this.hoursPerWeek = hoursPerWeek;
            this.weeksPerYear = weeksPerYear;
        }
        
        public double calcAnnualNetIncome(EmployeeInfo toBeAdded){
            double deduction = toBeAdded.getDeductionRate();
            return(hourlyWage * hoursPerWeek * weeksPerYear * (1 - deduction));
        }
        
	

	
}
