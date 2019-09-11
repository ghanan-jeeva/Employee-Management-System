import java.util.ArrayList;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is a EmployeeInfo
	// object holding a reference value pointing to a student.

	private ArrayList<EmployeeInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int employeeNumber) {
		return(employeeNumber % buckets.length);
	}


	public void addToTable(EmployeeInfo theStudent) {
		// Add the student referenced by theStudent to the hash table.
		int tempCalc;
		tempCalc = calcBucket(theStudent.employeeNumber);
		buckets[tempCalc].add(theStudent);
	}


	public EmployeeInfo removeFromTable(int employeeNumber) {
		// Remove that student from the hash table and return the reference value for that student.
		int tempCalc2;
		tempCalc2 = calcBucket(employeeNumber);
		
		int numInArray = buckets[tempCalc2].size();
		
		for (int i = 0; i < numInArray; i++){
			
			EmployeeInfo someEmployee = new EmployeeInfo();
			someEmployee = buckets[tempCalc2].get(i);
			EmployeeInfo tempStudent = someEmployee;
		 	
			if (someEmployee.employeeNumber == employeeNumber) {
		 		buckets[tempCalc2].remove(someEmployee);
		 		return(tempStudent);
	}
		}
		return(null);
	}


	public boolean isInTable(int employeeNumber) {
		// Return true if that student is in the hash table, false otherwise.
		int tempCalc3;
		tempCalc3 = calcBucket(employeeNumber);
		
		int numInArray = buckets[tempCalc3].size();
		
		for (int i = 0; i < numInArray; i++){
			
			EmployeeInfo someEmployee2 = new EmployeeInfo();
			someEmployee2 = buckets[tempCalc3].get(i);
			
		 	
			if (someEmployee2.employeeNumber == employeeNumber) {
		 		return(true);
			}
		 
		}
		return(false);
		
	}
	public EmployeeInfo empInfo(int employeeNumber) {           
		int tempCalc2;
		tempCalc2 = calcBucket(employeeNumber);
		
		int numInArray = buckets[tempCalc2].size();
		
		for (int i = 0; i < numInArray; i++){
			
			EmployeeInfo someEmployee = new EmployeeInfo();
			someEmployee = buckets[tempCalc2].get(i);
		 	
			if (someEmployee.employeeNumber == employeeNumber) {
		 		System.out.println(someEmployee);
		 		return(someEmployee);
		 
	}
		}
		return(null);

	}
	
	public void displayHashTable() {
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(""); 
			System.out.println("Employees in Bucket" + i);
			for (int x = 0; x < buckets[x].size(); x++) {
				System.out.println(buckets[i].get(x));
			}
		}
	}
	


}
