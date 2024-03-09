public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void showShape(String shape) {
        System.out.println("Shape selected: " + shape);
    }

    @Override
    public double calculateShape() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter not applicable for cylinder
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

