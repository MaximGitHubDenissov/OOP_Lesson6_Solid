package solid;

import solid.srp.Area;
import solid.srp.Point;
import solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Area area = new Area(square.getSide());
        square.setZoom(2);
        System.out.printf("Площадь фигуры: %d \n", area.getArea());
        square.draw();
    }
}
