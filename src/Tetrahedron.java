public class Tetrahedron extends ThreeDimensionalShape {

    public Tetrahedron(double a) {
        super(a);
    }

    @Override
    public double getArea() {
        return Math.pow(super.getA(), 2) * Math.sqrt(3);
    }

    @Override
    public double getVolume() {
        return (Math.pow(super.getA(), 3) * Math.sqrt(2)) / 12;
    }

    @Override
    public String toString() {
        return String.format("%n%s", "Tetrahedron: "
                + super.toString());
    }
}
