import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nChoose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    displayResults(circle);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    displayResults(rectangle);
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    displayResults(square);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    Sphere sphere = new Sphere(radius);
                    displayResults(sphere);
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, height);
                    displayResults(cylinder);
                    break;
                case 6:
                    System.out.print("Enter base side: ");
                    double baseSide = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    height = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(baseSide, height);
                    displayResults(pyramid);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
        scanner.close();
    }

    public static void displayResults(Shape shape) {
        System.out.println("\nShape: " + shape.shapeName);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        if (shape instanceof Volume) {
            System.out.println("Volume: " + ((Volume) shape).calculateVolume());
        }
    }
}
