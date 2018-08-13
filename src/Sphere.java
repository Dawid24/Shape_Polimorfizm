public class Sphere extends ThreeDimensionalShape {

    public Sphere(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(super.getA(), 2);
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(super.getA(), 3);
    }

    @Override
    public String toString() {
        return String.format("%n%s", "Sphere: "
                + super.toString());
    }
}
