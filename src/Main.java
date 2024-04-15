import sriDharacharyaFormula.QuadraticEq;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEq quadraticEq = new QuadraticEq();
        quadraticEq.discriminant(a, b, c);
        scanner.close();
    }
}