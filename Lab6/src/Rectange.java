import java.awt.geom.Point2D;

public class Rectange extends Shape{

    private double length;
    private double breadth;

    /**
     *
     * @param name
     * @param length
     * @param breadth
     */
    public Rectange(String name, double length, double breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public Point2D center() {
        return null;
    }

    @Override
    public void scale(double factor) {

    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public void setLocation(double v, double v1) {

    }
}
