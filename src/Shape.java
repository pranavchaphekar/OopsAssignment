public class Shape {
    double x;
    double y;
    String name = "";
    double delta;
    //double length;
    Shape() {
    }

    Shape(String name) {
        x = 0;
        y = 0;
        delta = 0;
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }
    void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void moveXYbyDelta(double x, double y, double delta) {
        this.x = x + delta;
        this.y = y + delta;
    }

    String getName() {
        return this.name;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }


    void aRea() {
        //this method is to show the implementation of method overriding, as we have the same method of name aRea() in the super and subclass.
        //Hence this method in the superclass will be not be accessed and will be overridden by th method in subclass.
    }

    void testConstructor() {
        Shape shape = new Shape();
        String name = "name";
        if(shape.getName() != null){
            System.out.println("Default constructor sets name");
            System.exit(1);
        }
        if ( shape.getX() != 0 )   {
            System.out.println("Default constructor sets instance variable");
            System.exit(2);
        }
        shape = new Shape(name);
        if ( ! shape.getName().equals(name) )  {
            System.out.println("constructor sets name incorrectly" );
            System.exit(3);
        }
    }
    void testPosition()    {
        Shape shape = new Shape();
        double x = 3;
        double xDelta = -2;
        shape.setXY(x ,y);
        if ( shape.getX() != x)    {
            System.out.println("set of x value incorrectly");
            System.exit(4);
        }
        shape.moveXYbyDelta(x,y,delta);
        if ( shape.getX() != x + xDelta)   {
            System.out.println("move of x value incorrectly");
            System.exit(4);
        }
    }
}