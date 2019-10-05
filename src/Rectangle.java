import java.util.Scanner;

public class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(){

    }
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void setSize(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    void aRea(){
        System.out.print("\n The Area for the input: Rectangle " +getName()+ " "
                +getX()+ " " +getY()+ " " +length+ " "+width+ " is = " +(length * width));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1 if you wish to change the position of the origin or 0 otherwise");
        int move = sc.nextInt();
        if (move == 1) {
            System.out.println("Enter the value by what you like to shift it: ");
            moveXYbyDelta(getX(), getY(), sc.nextDouble());
            System.out.print("\n The Area for the input: Square " + getName() + " "
                    + getX() + " " + getY() + " " +length+ " "+width+ " is = " +(length * width));

        } else {
            System.exit(0);
        }


    }

}

