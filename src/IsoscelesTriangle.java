import java.util.Scanner;

public class IsoscelesTriangle extends Shape {
    double breadth;
    double height;
    IsoscelesTriangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }
    void aRea(){
        System.out.print("\n The Area for the input: IsocelesTriangle " +getName()+ " "
                +getX()+ " " +getY()+ " " +breadth+ " "+height+ " is = " +((breadth * height)/2));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 if you wish to change the position of the origin or 0 otherwise");
        int move = sc.nextInt();
        if (move == 1) {
            System.out.println("Enter the value by what you like to shift it: ");
            moveXYbyDelta(getX(), getY(), sc.nextDouble());
            System.out.print("\n The Area for the input: IsoscelesTriangle " + getName() + " "
                    + getX() + " " + getY() + " " + breadth+ " "+height+ " is = " +((breadth * height)/2));

        } else {
            System.exit(0);
        }

    }
}

