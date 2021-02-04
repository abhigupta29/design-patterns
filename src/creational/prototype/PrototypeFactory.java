package creational.prototype;

public class PrototypeFactory {

    public Shape get(Shape shape) {
        return shape.makeClone();
    }
}
