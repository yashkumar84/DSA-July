public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators [+ , -, * , / , %]
        // Assignment Operators [= , += , -= ,*= ,/=]
        // Comparison Operators [== , > , < , >= , <=]
        // Logical Operators [&& , || , !]
        int a = 1000;
        int b = 1000;
        int c = 60;
        // b /= a; // b = b / a;

        // Comparison

        if (a >= b && a >= c) {
            System.out.println("A is greater ");
        } else if (b >= a && b >= c) {
            System.out.println("B is Greater");
        } else {
            System.out.println("C is Greater ");
        }

        String s = "Sahil ke Papa";

        if (s == "Sahil" || s == "Aman" || s == "Yash") {
            System.out.println("Pay Money");
        } else {
            System.out.println("DO not Pay Money");
        }

        String condition = "Suunny";

        if (condition == "Baarish") {
            System.out.println("Not go to School");
        } else if (condition == "Marriage") {
            System.out.println("Not go to School");

        } else if (condition == "Fever") {
            System.out.println("Not go to School");
        } else {
            System.out.println("Go to School");
        }

        if (!false) {
            System.out.println("Hello");
        }

    }
}