public class Main {

    public static void displayShapeInfo(Shape shape){
        System.out.println("The Shape is a " + shape.getShapeName());
        System.out.println("The area of the Shape is " + shape.getArea());
    }

    public static void main(String[] args) {

        //Main for car Example
        Car car1 = new Car("Mercedes","Black",100,200);
        Car car2 = new Car("BMW","White",130,230,50);

        System.out.println(car1.getFuel());
        System.out.println(car2.getFuel());


        //Main for Shape Example

        Circle c1 = new Circle(2);
        Rectangle r1 = new Rectangle(2,3);
        displayShapeInfo(c1);
        displayShapeInfo(r1);
    }

}

