/**
 * Rectangle class that extends the Shape class.
 * This class demonstrates inheritance and method overriding.
 */
class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructor to initialize length and width of the rectangle.
     * 
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Overrides the calculateArea method for a Rectangle.
     * Formula: length * width
     */
    @Override
    double calculateArea() {
        return length * width;
    }
}
