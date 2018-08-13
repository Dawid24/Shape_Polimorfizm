public class Square extends TwoDimensionalShape {

    public Square(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return super.getA() * super.getB();
    }

    @Override
    public String toString() {
        return String.format("%n%s", "Square: "
                + super.toString());
    }
}
