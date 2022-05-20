

public class Student {

	String name;
	Double firstGrade;
	Double secondGrade;
	Double thirdGrade;
	
	public Double finalGrade() {
		return firstGrade + secondGrade + thirdGrade;
		
	}
	
	public String result() {
		
		if(finalGrade() >= 60) { 
			return "PASS";
		}
		else {
			return "FAILED";
		}
	}
	
	public Double missing() {
		return 60 - finalGrade();
	}
}
