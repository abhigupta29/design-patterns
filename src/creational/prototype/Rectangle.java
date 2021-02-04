package creational.prototype;

public class Rectangle implements Shape {

    public int x;
    public int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle() {}

    @Override
    public Shape makeClone() {
        Rectangle rectangleObject = null;

        try {
            rectangleObject = (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return rectangleObject;
    }
}
