import java.awt.geom.Point2D;

public class Square extends Rectange{

    private double side;

    /**
     *
     * @param name
     * @param side of the shape Square
     */
    public Square(String name, double side) {
        super(name, side, side);
        this.side = side;
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
