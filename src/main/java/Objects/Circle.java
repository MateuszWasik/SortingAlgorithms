package Objects;

public class Circle implements SurfaceArea {

    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateSurfaceArea() {
        return Math.PI*(r*r);
    }
}
