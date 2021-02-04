package creational.prototype;

public class PrototypeMainClass {

    public static void main(String[] args) {

        PrototypeFactory prototypeFactory = new PrototypeFactory();

        Circle circle1 = new Circle(7);
        Circle circle2 = (Circle) prototypeFactory.get(circle1);
        System.out.println("Circle1: "+circle1+" => r: "+circle1.r);
        System.out.println("Circle2: "+circle2+" => r: "+circle2.r);

        Rectangle rectangle1 = new Rectangle(7, 8);
        Rectangle rectangle2 = (Rectangle) prototypeFactory.get(rectangle1);
        System.out.println("Rectangle1: "+rectangle1+" => x: "+ rectangle1.x+ ", y: "+ rectangle1.y);
        System.out.println("Rectangle2: "+rectangle2+" => x: "+ rectangle2.x+ ", y: "+ rectangle2.y);
    }
}
