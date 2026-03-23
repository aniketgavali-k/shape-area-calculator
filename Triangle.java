/**
 * Triangle class that extends the Shape class.
 * This class demonstrates inheritance and method overriding.
 */
class Triangle extends Shape {
    private double base;
    private double height;

    /**
     * Constructor to initialize base and height of the triangle.
     * 
     * @param base The base of the triangle.
     * @param height The height of the triangle.
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Overrides the calculateArea method for a Triangle.
     * Formula: 0.5 * base * height
     */
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
