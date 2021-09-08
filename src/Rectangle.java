public class Rectangle implements Shape{

    private int length,width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
