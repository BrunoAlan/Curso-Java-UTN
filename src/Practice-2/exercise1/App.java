public class App {
    public static void main(String[] args) {

        // SQUARE

        // Instantiate an square with 2 units of base
        Square sq1 = new Square(2.0);

        // Calculate perimeter
        System.out.println(sq1.calculatePerimeter()); // 8

        // Calculate area
        System.out.println(sq1.calculateArea()); // 4

        // RECTANGLE

        // Instantiate a rectangle with 4 and 2 units sides
        Rectangle rect1 = new Rectangle(4.0, 2.0);

        // Calculate perimeter
        System.out.println(rect1.calculatePerimeter()); // 12

        // Calculate area
        System.out.println(rect1.calculateArea()); // 8

        // CIRCLE

        // Instantiate a cirle with 4 units of perimeter
        Circle circle1 = new Circle(4.0);

        // Calculate perimeter
        System.out.println(circle1.calculatePerimeter()); // 25.13

        // Calculate area
        System.out.println(circle1.calculateArea()); // 50.26
    }
}
