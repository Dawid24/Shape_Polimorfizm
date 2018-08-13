public class Circle extends TwoDimensionalShape {

    public Circle(double a, double b) {
        super(a, b);
    }

    public Circle(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(super.getA(), 2);
    }

    @Override
    public String toString() {
        return String.format("%n%s", "Circle: "
                + super.toString());
    }
}





