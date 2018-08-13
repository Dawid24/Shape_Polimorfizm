public abstract class Shape {
    private double a;

    public Shape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                '}';
    }
}
