/**
 * Circle class that extends the Shape class.
 * This class demonstrates inheritance and method overriding.
 */
class Circle extends Shape {
    private double radius;

    /**
     * Constructor to initialize the radius of the circle.
     * 
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Overrides the calculateArea method for a Circle.
     * Formula: π * r * r
     */
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
