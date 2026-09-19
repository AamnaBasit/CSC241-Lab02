public class Task2Demo {
	public static void main(String[] args) {
//Create object 1
	Student s1 = new Student();
	s1.studentId = "BAI-001";
	s1.name = "Aamna Basit";
	s1.completedCredits = 15;
//Create object 2
	Student s2 = new Student();
	s2.studentId = "BAI-028";
	s2.name = "Maheen Tajammal";
	s2.completedCredits = 18;

//Calling Methods on object 1
System.out.println(s1.summary());
s1.addCredits(3);
System.out.println("After addCredits: " + s1.summary());
System.out.println("Remaining for s1: "  + s1.remainingCredits(130));

System.out.println();  //Blank line
//Calling Method on object 2
System.out.println(s2.summary());
System.out.println("Remaining for s2: "  + s2.remainingCredits(130));

	}
}