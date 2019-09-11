
public class EmployeeInfo
{


    // Attributes

    protected int employeeNumber;
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected String workLocation;
    protected double deductRate;


    // Constructors

    public EmployeeInfo (int employeeNumber, String fN, String lN, int gD, int wL, double dR) {
	this.employeeNumber = employeeNumber;
	firstName = fN;
	lastName = lN;
	gender = gD;
	workLocation = wL;
	deductRate = dR;
    }
    
    public EmployeeInfo () {
	employeeNumber = 0;
	firstName = null;
	lastName = null;
	gender = 0;
	workLocation = 0;
	deductRate = 0;
    }

}

