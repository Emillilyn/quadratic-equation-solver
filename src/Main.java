import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----.function-----");
        System.out.println("ax^2 + bx + c = 0 ");

        System.out.println("Input a: ");
        double a = input.nextDouble();
        System.out.println("Input b: ");
        double b = input.nextDouble();
        System.out.println("input c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("WARNING: a = 0, this is not a quadratic equation. Solving as linear: bx + c = 0");

            if (b != 0) {
                System.out.println("One root: x = " + (-c / b));
            } else if (c == 0) {
                System.out.println("0 = 0, every real number is a solution.");
            } else {
                System.out.println("No solution.");
            }
            return;
        }

        double D = b * b - 4 * a * c; //Discriminant

        switch(Double.compare(D, 0)) {
            case -1:
                System.out.println("No real roots!, solving for imaginary numbers: ");
                double real = -b/(2*a);
                double imag = Math.sqrt(-D) / (2 * Math.abs(a));
                System.out.println("Complex roots: x1 = " + real + " + " + imag + "i, x2 = " + real + " - " + imag + "i");
                break;
            case 0:
                double x = -b/ (2*a);
                System.out.println("One root: x = " + x);
                break;
            case 1:
                double sqrtD = Math.sqrt(D);
                double x1 = (-b + sqrtD) / (2 * a);
                double x2 = (-b - sqrtD) / (2 * a);
                System.out.println("Two roots: x1 = " + x1 + "x2 = " + x2);
                break;
        }
    }
}
