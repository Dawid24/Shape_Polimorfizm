public abstract class TwoDimensionalShape extends Shape {
    private double b;

    public TwoDimensionalShape(double a, double b) {
        super(a);
        this.b = b;
    }

    public TwoDimensionalShape(double a) {
        super(a);
    }

    public double getB() {
        return b;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return String.format(super.toString()
                + "TwoDimensionalShape{" +
                "b=" + b +
                '}');
    }
}
