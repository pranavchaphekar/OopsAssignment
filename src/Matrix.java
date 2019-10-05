import java.util.Scanner;

public class Matrix extends Rectangle{
    double matrixManipulation [][] = new double[5][2];
    String name;
    double x;
    double y;
    double length;
    double width;
    Matrix(String name){
        this.name = name;
    }

    void setMatrixComp() {
        this.length = getLength();
        this.width = getWidth();
        this.x = getX();
        this.y = getY();
        matrixManipulation[0][0] = x;
        matrixManipulation[0][1] = y;
        matrixManipulation[1][0] = x;
        matrixManipulation[1][1] = y;
        matrixManipulation[2][1] = y;
        matrixManipulation[4][0] = x;
        moveXYbyDelta(x, y, length);
        matrixManipulation[2][0] = getX();
        matrixManipulation[3][0] = getX();
        moveXYbyDelta(x, y, width);
        matrixManipulation[3][1] = getY();
        matrixManipulation[4][1] = getY();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixManipulation[i][j] + " ");
            }
            System.out.println();
        }
        setScaleManipulation();
    }

    void setScaleManipulation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 if you want to scale your polygon any other number to exit the program");
        int move = sc.nextInt();
        if(move==1){
            System.out.println("Enter the factor by which you want to scale");
            double fact = sc.nextDouble();
            setScale(fact);
            matrixManipulation[0][0] = x;
            matrixManipulation[0][1] = y;
            matrixManipulation[1][0] = x;
            matrixManipulation[1][1] = y;
            matrixManipulation[2][1] = y;
            matrixManipulation[4][0] = x;
            moveXYbyDelta(x,y,length);
            matrixManipulation[2][0]=getX();
            matrixManipulation[3][0]=getX();
            moveXYbyDelta(x,y,width);
            matrixManipulation[3][1]=getY();
            matrixManipulation[4][1]=getY();

            for(int i=0;i<5;i++){
                for(int j=0;j<2;j++){
                    System.out.print(matrixManipulation[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\nPress 1 if you wish to continue");
            int last = sc.nextInt();
            if (last == 1)
                setScaleManipulation();
            else
                System.exit(0);
        }
        else{
            System.exit(0);
        }
    }


    void setScale(double factor)   // scale or x,y positions  of the corners by factor
    {
        this.length *= factor;
        this.width *= factor;

    }

}
