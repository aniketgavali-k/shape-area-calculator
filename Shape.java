/**
 * Parent class representing a generic Shape.
 * This class serves as a blueprint for specific shapes.
 */
class Shape {
    /**
     * Method to calculate the area of the shape.
     * In the base class, it returns 0 as a default.
     * Subclasses will override this to provide specific logic.
     * 
     * @return The calculated area as a double.
     */
    double calculateArea() {
        return 0.0;
    }
}
