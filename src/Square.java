import java.util.Scanner;

public class Square extends Shape{
    double length = 0;
    Square(double length) {
        this.length = length;
    }
    void aRea(){
        System.out.print("\n The Area for the input: Square " +getName()+ " "
                +getX()+ " " +getY()+ " " +length+ " is = " +(length * length));
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 if you wish to change the position of the origin or 0 otherwise");
        int move = sc.nextInt();
        if (move == 1) {
            System.out.println("Enter the value by what you like to shift it: ");
            moveXYbyDelta(getX(), getY(), sc.nextDouble());
            System.out.print("\n The Area for the input: Square " + getName() + " "
                    + getX() + " " + getY() + " " +length+ " is = " +(length * length));

        } else {
            System.exit(0);
        }


    }
}
