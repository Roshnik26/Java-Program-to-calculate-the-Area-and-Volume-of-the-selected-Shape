import java.util.Scanner;

public class ShapeCalculator {
    private Scanner scanner;

    public ShapeCalculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        while (true) {
            System.out.println("\nChoose a shape to calculate its area and volume:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateCircle();
                    break;
                case 2:
                    calculateRectangle();
                    break;
                case 3:
                    calculateSquare();
                    break;
                case 4:
                    calculateSphere();
                    break;
                case 5:
                    calculateCylinder();
                    break;
                case 6:
                    calculatePyramid();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void calculateCircle() {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.showShape("Circle");
        System.out.println("Area: " + circle.calculateShape());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }

    private void calculateRectangle() {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.showShape("Rectangle");
        System.out.println("Area: " + rectangle.calculateShape());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }

    private void calculateSquare() {
        System.out.print("Enter side length: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        square.showShape("Square");
        System.out.println("Area: " + square.calculateShape());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }

    private void calculateSphere() {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Sphere sphere = new Sphere(radius);
        sphere.showShape("Sphere");
        System.out.println("Surface Area: " + sphere.calculateShape());
                System.out.println("Volume: " + sphere.calculateVolume());
    }

    private void calculateCylinder() {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.showShape("Cylinder");
        System.out.println("Surface Area: " + cylinder.calculateShape());
        System.out.println("Volume: " + cylinder.calculateVolume());
    }

    private void calculatePyramid() {
        System.out.print("Enter base length: ");
        double baseLength = scanner.nextDouble();
        System.out.print("Enter base width: ");
        double baseWidth = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        Pyramid pyramid = new Pyramid(baseLength, baseWidth, height);
        pyramid.showShape("Pyramid");
        System.out.println("Surface Area: " + pyramid.calculateShape());
        System.out.println("Volume: " + pyramid.calculateVolume());
    }
}




