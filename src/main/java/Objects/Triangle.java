package Objects;

public class Triangle implements SurfaceArea {

    double a;
    double h;

    Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculate() {
        return (1/2*a)*h;
    }
}
