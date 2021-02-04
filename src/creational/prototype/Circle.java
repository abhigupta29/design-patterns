package creational.prototype;

public class Circle implements Shape {

    public int r;

    public Circle(){}

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public Shape makeClone() {
        Circle circle = null;

        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return circle;
    }
}
