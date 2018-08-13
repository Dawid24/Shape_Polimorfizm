public class Cube extends ThreeDimensionalShape {

    public Cube(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(super.getA(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(super.getA(), 3);
    }

    @Override
    public String toString() {
        return String.format("%n%s", "Cube: "
                + super.toString());
    }
}
