public class Square extends GeometricalFigure {

    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    public Double getBase() {
        return side;
    }

    public void setBase(Double side) {
        this.side = side;
    }

    @Override
    public Double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public Double calculateArea() {
        return side * side;
    }
}
