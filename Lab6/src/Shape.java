import java.awt.geom.Point2D;

public abstract class Shape extends Point2D {

    private String name;

    /**
     * Constructor for initializing the class
     * @param name The name of the shape object
     */
    public Shape(String name){
        this.name = name;
    }

    /**
     * Area of the shape
     * @return Area
     */
    public abstract double area();

    /**
     * Center of the shape
     * @return Center
     */
    public abstract Point2D center();

    /**
     * The scaling factor
     * @param factor 
     */
    public abstract void scale(double factor);
}
