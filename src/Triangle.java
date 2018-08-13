public class Triangle extends TwoDimensionalShape {

    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return 0.5 * super.getA() * super.getB();
    }

    @Override
    public String toString() {
        return String.format("%n%s", "Triangle: "
                + super.toString());
    }
}
