import java.util.Scanner;

/**
 * Main class for the Shape Area Calculator application.
 * This class handles user interaction, takes inputs, and uses polymorphism
 * to calculate areas for different shapes.
 */
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("----------------------------------------");
        System.out.println("   Welcome to Shape Area Calculator!   ");
        System.out.println("----------------------------------------");

        // Loop that keeps the program running until the user chooses to exit
        while (choice != 4) {
            System.out.println("\nSelect a shape to calculate its area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            // Read the user's choice
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Consume invalid input
                continue;
            }

            Shape shape = null; // Declare a reference of the parent class type

            // Use switch-case to handle the user's choice
            switch (choice) {
                case 1:
                    // Case for Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius); // Create a Circle object
                    break;

                case 2:
                    // Case for Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width); // Create a Rectangle object
                    break;

                case 3:
                    // Case for Triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height); // Create a Triangle object
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the application. Thank you!");
                    break;

                default:
                    // Handle invalid menu options
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }

            // If a shape was created, display the calculated area
            if (shape != null) {
                // Here, polymorphism is demonstrated as the same method name (calculateArea)
                // behaves differently depending on which child object the shape reference points to.
                double area = shape.calculateArea();
                System.out.printf("The calculated area is: %.2f\n", area);
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
