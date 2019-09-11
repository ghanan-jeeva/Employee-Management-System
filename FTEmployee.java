
public class FTEmployee extends EmployeeInfo{
	
	protected double salary;
	
	
	public void FTEmployee(int num, String fN, String lN, int gender, int workL, double dR, double sL) {
	    super(num, fN, lN, gender, workL, dR);
            salary = sL;
	}
	
        public void setSalary(double salary){
            this.salary = salary;
        }
        
        public double getAnnualSalary(){
            return salary;
        }
        
        public double calcAnnualNetIncome(EmployeeInfo toBeAdded){
            double deduction = toBeAdded.getDeductionRate();
            return(salary * (1 - deduction));
        }
	
	
}
