package Objects;

public class Square implements SurfaceArea {

    double a;
    private double surfaceArea;

    Square(float a) {
        this.a = a;
        this.surfaceArea = calculateSurfaceArea();
    }

    @Override
    public double calculateSurfaceArea() {
        return a*a;
    }

}
