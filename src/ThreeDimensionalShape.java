public abstract class ThreeDimensionalShape extends Shape {


    public ThreeDimensionalShape(double a) {
        super(a);
    }

    public abstract double getArea();
    public abstract double getVolume();

    @Override
    public String toString() {
        return String.format(super.toString() +
                "ThreeDimensionalShape{" + '}');
    }
}
