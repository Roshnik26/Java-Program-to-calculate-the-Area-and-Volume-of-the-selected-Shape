public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void showShape(String shape) {
        System.out.println("Shape selected: " + shape);
    }

    @Override
    public double calculateShape() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

