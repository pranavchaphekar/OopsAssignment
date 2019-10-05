//taking the two parameters as diagonals of the kite to calculate the area of the kite.


import java.util.Scanner;

public class Kite extends Shape {
    double diag1;
    double diag2;
    Kite(double diag1, double diag2) {
        this.diag1 = diag1;
        this.diag2 = diag2;
    }
    void aRea(){

        System.out.print("\n The Area for the input: Kite " +getName()+ " "
                +getX()+ " " +getY()+ " " +diag1+ " "+diag2+ " is = " +((diag1 * diag2)/2));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 if you wish to change the position of the origin or 0 otherwise");
        int move = sc.nextInt();
        if (move == 1) {
            System.out.println("Enter the value by what you like to shift it: ");
            moveXYbyDelta(getX(), getY(), sc.nextDouble());
            System.out.print("\n The Area for the input: Kite " + getName() + " "
                    + getX() + " " + getY() + " " + diag1+ " "+diag2+ " is = " +((diag1 * diag2)/2));

        } else {
            System.exit(0);
        }

    }
}