public class Task1Demo{
	public static void main(String[] args) {
//Create 3 student object	
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
//Assign Values
	s1.studentId = "BAI-001"; s1.name = "Aamna Basit"; s1.completedCredits = 15;
	s2.studentId = "BAI-028"; s2.name = "Maheen Tajammal"; s2.completedCredits = 18;
	s3.studentId = "BAI-046"; s3.name = "Swera Kamran"; s3.completedCredits = 12;
	System.out.println("---Before Change---");
 	System.out.println(s1.name + "(" + s1.studentId + "): " +  s1.completedCredits + "credits");
	System.out.println(s2.name + "(" + s2.studentId + "): " +  s2.completedCredits + "credits"); 
	System.out.println(s3.name + "(" + s3.studentId + "): " +  s3.completedCredits + "credits");

//Modify Completed hours of only one object (s2)
s2.completedCredits = 21;

//Print all three objects again

System.out.println("---After Change---");
 	System.out.println(s1.name + "(" + s1.studentId + "): " +  s1.completedCredits + "credits");
	System.out.println(s2.name + "(" + s2.studentId + "): " +  s2.completedCredits + "credits"); 
	System.out.println(s3.name + "(" + s3.studentId + "): " +  s3.completedCredits + "credits");

	}
}
