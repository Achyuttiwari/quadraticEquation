package sriDharacharyaFormula;

public class QuadraticEq {
    public void discriminant(double a, double b, double c){
        double discriminant = b * b - 4* a * c;
        if(discriminant > 0){
            //two real and distinct root
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real and distinct roots: ");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2:" + root2);
        }
        else if(discriminant == 0){
            //one real root repeated
            System.out.println("One real root (repeated):");
            double root = -b / (2 * a);
            System.out.println("Root: "  + root );
        }
        else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex roots:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
