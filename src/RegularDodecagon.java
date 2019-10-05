import java.util.Scanner;

public class RegularDodecagon extends Shape {
    double length = 0;
    RegularDodecagon(double length) {
        this.length = length;
    }


    void aRea() {
        System.out.print("\n The Area for the input: RegularDodecagon " +getName()+ " "
                +getX()+ " " +getY()+ " " +length+ " is = " +(3*(2+Math.sqrt(3))));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 if you wish to change the position of the origin or 0 otherwise");
        int move = sc.nextInt();
        if (move == 1) {
            System.out.println("Enter the value by what you like to shift it: ");
            moveXYbyDelta(getX(), getY(), sc.nextDouble());
            System.out.print("\n The Area for the input: RegularDodecagon " + getName() + " "
                    + getX() + " " + getY() + " " +length+ " is = " +(3*(2+Math.sqrt(3))));

        } else {
            System.exit(0);
        }

    }
}
