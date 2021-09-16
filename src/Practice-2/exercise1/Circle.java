public class Circle extends GeometricalFigure {

    private Double radious;

    public Circle(Double radious) {
        this.radious = radious;
    }

    public Double getRadious() {
        return radious;
    }

    public void setRadious(Double radious) {
        this.radious = radious;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radious;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radious * radious;
    }
}
