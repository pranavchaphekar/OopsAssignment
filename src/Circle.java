import java.util.Scanner;

public class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void aRea() {

        System.out.print("\n The Area for the input: Circle " + getName() + " "
                + getX() + " " + getY() + " " + radius + " is = " + (Math.PI * radius * radius));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 if you wish to change the position of the origin or 0 otherwise");
        int move = sc.nextInt();
        if (move == 1) {
            System.out.println("Enter the value by what you like to shift it: ");
            moveXYbyDelta(getX(), getY(), sc.nextDouble());
            System.out.print("\n The Area for the input: Circle " + getName() + " "
                    + getX() + " " + getY() + " " + radius + " is = " + (Math.PI * radius * radius));

        }
        else {
            System.exit(0);
        }
    }
}
