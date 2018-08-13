public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12.5);
        Square square = new Square(8.6, 13.1);
        Triangle triangle = new Triangle(17.9, 5.2);
        Sphere sphere = new Sphere(13.4);
        Cube cube = new Cube(9.9);
        Tetrahedron tetrahedron = new Tetrahedron(11.0);

        Shape[] shapes = new Shape[6];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;
        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;

        for (Shape currentShape : shapes ) {
            System.out.println(currentShape);
            if (currentShape instanceof TwoDimensionalShape) {
                System.out.println(((TwoDimensionalShape) currentShape).getArea());
            }
            if (currentShape instanceof ThreeDimensionalShape) {
                System.out.println(((ThreeDimensionalShape) currentShape).getArea());
                System.out.println(((ThreeDimensionalShape) currentShape).getVolume());
            }
        }

    }
}
