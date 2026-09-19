class Student {
	String studentId;
	String name;
//Method 1:	
int completedCredits;
	 void addCredits(int credits) {
		completedCredits += credits;
	}
//Method 2:
	int remainingCredits(int degreeCredits) {
		int remaining = degreeCredits - completedCredits; // local variable 'remaining'
return remaining;
}
//Method 3:
String summary() {
	return "ID: " + studentId + ", Name: " + name + "Credits: " + completedCredits; 	
	}

}