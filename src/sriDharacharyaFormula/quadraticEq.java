package sriDharacharyaFormula;

public class quadraticEq {
    private void Discriminant(double a, double b, double c){
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
            //
        }
    }
}
