package Objects;

public class Square implements SurfaceArea {

    double a;

    Square(float a) {
        this.a = a;
    }

    @Override
    public double calculateSurfaceArea() {
        return a*a;
    }

}
