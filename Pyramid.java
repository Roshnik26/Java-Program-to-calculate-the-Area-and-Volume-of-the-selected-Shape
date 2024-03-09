public class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public void showShape(String shape) {
        System.out.println("Shape selected: " + shape);
    }

    @Override
    public double calculateShape() {
        return (baseLength * baseWidth) / 2.0;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter not applicable for pyramid
    }

    @Override
    public double calculateVolume() {
        return (baseLength * baseWidth * height) / 3.0;
    }
}

