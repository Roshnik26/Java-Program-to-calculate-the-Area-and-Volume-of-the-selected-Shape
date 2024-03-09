public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void showShape(String shape) {
        System.out.println("Shape selected: " + shape);
    }

    @Override
    public double calculateShape() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter not applicable for sphere
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

