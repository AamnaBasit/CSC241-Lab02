public class OverloadDemo {

    // Overload 1: Single parameter
    public void addCredits(int credits) {
        System.out.println("1 parameter: Added " + credits + " credits.");
    }

    // Overload 2: Two parameters
    public void addCredits(int credits, int courseCount) {
        System.out.println("2 parameters: Added " + credits + " credits from " + courseCount + " courses.");
    }

    // Overload 3: Three parameters with different types
    public void addCredits(int credits, int courseCount, boolean verified) {
        System.out.println("3 parameters: Added " + credits + " credits with status " + verified + ".");
    }

  
    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        // Valid overloaded calls
        demo.addCredits(3);
        demo.addCredits(3, 1);
        demo.addCredits(6, 2, true);
    }
}