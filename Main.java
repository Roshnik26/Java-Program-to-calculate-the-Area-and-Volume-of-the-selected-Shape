import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Shape Calculator!");

        ShapeCalculator shapeCalculator = new ShapeCalculator(scanner);
        shapeCalculator.menu();
    }
}

