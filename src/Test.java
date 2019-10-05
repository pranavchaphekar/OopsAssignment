import java.util.Scanner;


public class Test {

    String kindOne = "Circle RegularDodecagon RegularHexagon Square";
    String kindTwo = "Ellipse IsoscelesTriangle Kite Rectangle";
    Shape shapes;

    public void go() {
        Shape sp = new Shape();
        System.out.print("Enter the line : ");

        Scanner userInput = new Scanner(System.in);
        String[] line;
        while (userInput.hasNextLine()) {
            line = userInput.nextLine().split("\\s+");
            if (kindOne.contains(line[0]))
                createKindOne(line[0], line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]), Double.parseDouble(line[4]));
            else
                createKindTwo(line[0], line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]), Double.parseDouble(line[4]), Double.parseDouble(line[5]));

        }
    }
    void createKindOne (String shape_name, String name,double x, double y, double unit1 ) {
        Scanner sc = new Scanner(System.in);
        switch (shape_name) {
            case "Circle":
                Shape circleShape = new Circle(unit1);
                circleShape.setName(name);
                circleShape.setXY(x, y);
                circleShape.aRea();
                break;

            case "RegularDodecagon":
                Shape regdode = new RegularDodecagon(unit1);
                regdode.setName(name);
                regdode.setXY(x,y);
                regdode.aRea();
                break;
            case "RegularHexagon":
                Shape reghex = new RegularHexagon(unit1);
                reghex.setName(name);
                reghex.setXY(x, y);
                reghex.aRea();
                break;
            case "Square":
                Shape square = new Square(unit1);
                square.setName(name);
                square.setXY(x, y);
                square.aRea();
                break;

        }

        System.out.println("\nPress 1 if you wish to continue");
        int last = sc.nextInt();
        if (last == 1)
            go();
        else
            System.exit(0);
    }

    void createKindTwo (String shape_name, String name,double x, double y, double unit1, double unit2){
        switch(shape_name){
            case "Ellipse":
                Shape ellipse = new Ellipse(unit1,unit2);
                ellipse.setName(name);
                ellipse.setXY(x, y);
                ellipse.aRea();
                break;
            case "IsoscelesTriangle":
                Shape iso = new IsoscelesTriangle(unit1,unit2);
                iso.setName(name);
                iso.setXY(x, y);
                iso.aRea();
                break;
            case "Kite":
                Shape kite = new Kite(unit1,unit2);
                kite.setName(name);
                kite.setXY(x, y);
                kite.aRea();
                break;
            case "Rectangle":
                Shape rect = new Rectangle(unit1,unit2);
                rect.setName(name);
                rect.setXY(x, y);
                rect.aRea();
                break;

        }
        System.out.println("\nPress 1 if you wish to continue");
        Scanner sc = new Scanner(System.in);
        int last = sc.nextInt();
        if(last == 1)
            go();
        else
            System.exit(0);
    }

    public void MatrixComputation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, the coordinates of the origin and the length and width of the polygon");
        String splitArray []= new String[4];
        while (sc.hasNextLine()) {
            splitArray = sc.nextLine().split("\\s+");

            Matrix poly = new Matrix(splitArray[0]);
            poly.setSize(Double.parseDouble(splitArray[3]),Double.parseDouble(splitArray[4]));
            poly.setXY(Double.parseDouble(splitArray[1]),Double.parseDouble(splitArray[2]));
            poly.setMatrixComp();

        }
    }

    public static void main(String args[]) {
        //new Test().MatrixComputation();
        new Test().go();
        new Shape().testConstructor();
        new Shape().testPosition();
    }





}