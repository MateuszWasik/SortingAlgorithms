package Objects;

public class Square implements SurfaceArea {

    double a;

    Square(float a) {
        this.a = a;
    }

    @Override
    public double calculate() {
        return a*a;
    }
}
