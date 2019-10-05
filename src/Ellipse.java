import java.util.Scanner;

public class Ellipse extends Shape {

    double axis1;
    double axis2;

    Ellipse(double axis1, double axis2) {
        this.axis1 = axis1;
        this.axis2 = axis2;
    }

    void aRea() {
        System.out.print("\n The Area for the input: Ellipse " + getName() + " "
                + getX() + " " + getY() + " " + axis1 + " " + axis2 + " is = " + (Math.PI * axis1 * axis2));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 if you wish to change the position of the origin or 0 otherwise");
        int move = sc.nextInt();
        if (move == 1) {
            System.out.println("Enter the value by what you like to shift it: ");
            moveXYbyDelta(getX(), getY(), sc.nextDouble());
            System.out.print("\n The Area for the input: ellipse " + getName() + " "
                    + getX() + " " + getY() + " " + +axis1 + " " + axis2 + " is = " + (Math.PI * axis1 * axis2));

        } else {
            System.exit(0);
        }

    }
}

