package Objects;

public class Triangle implements SurfaceArea {

    double a;
    double h;
    private double surfaceArea;

    Triangle(double a, double h) {
        this.a = a;
        this.h = h;
        this.surfaceArea = calculateSurfaceArea();
    }

    @Override
    public double calculateSurfaceArea() {
        return (1/2*a)*h;
    }

}
