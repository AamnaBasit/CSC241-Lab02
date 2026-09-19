public class PassByValueDemo {

    // Experiment 1: Primitive Pass-By-Value
    public static void tryPrimitiveMutation(int val) {
        val = val + 10;
        System.out.println("Inside tryPrimitiveMutation: val = " + val);
    }

    // Experiment 2: Object Reference - Mutating Field
    public static void tryObjectMutation(Student s) {
        s.completedCredits = s.completedCredits + 10;
        System.out.println("Inside tryObjectMutation: credits = " + s.completedCredits);
    }

    // Experiment 3: Object Reference - Reassigning Reference
    public static void tryObjectReassignment(Student s) {
        s = new Student();
        s.name = "Reassigned Name";
        System.out.println("Inside tryObjectReassignment: name = " + s.name);
    }

    public static void main(String[] args) {
 // 1. Primitive Test
        int originalVal = 10;
        System.out.println("--- Primitive Experiment ---");
        System.out.println("Before tryPrimitiveMutation: val = " + originalVal);
        tryPrimitiveMutation(originalVal);
        System.out.println("After tryPrimitiveMutation: val = " + originalVal);

        // Setup Student object for reference tests
        Student st = new Student();
        st.name = "Aamna Basit";
        st.completedCredits = 15;
 // 2. Object Field Mutation Test
        System.out.println("\n--- Reference Object Mutation Experiment ---");
        System.out.println("Before tryObjectMutation: credits = " + st.completedCredits);
        tryObjectMutation(st);
        System.out.println("After tryObjectMutation: credits = " + st.completedCredits);

  // 3. Object Reassignment Test
        System.out.println("\n--- Reference Object Reassignment Experiment ---");
        System.out.println("Before tryObjectReassignment: name = " + st.name);
        tryObjectReassignment(st);
        System.out.println("After tryObjectReassignment: name = " + st.name);
    }
}