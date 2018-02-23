package Objects;

public class Circle implements SurfaceArea {

    double r;
    private double surfaceArea;

    public Circle(double r) {
        this.r = r;
        this.surfaceArea = calculateSurfaceArea();
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    @Override
    public double calculateSurfaceArea() {
        return Math.PI*(r*r);
    }
}
