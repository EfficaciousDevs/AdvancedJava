public class Cube extends Shape{
    private double length;
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area(){
        return (2*getLength()*getWidth()) + (2*getLength()*getHeight()) + (2*getHeight()*getWidth());
    }
    @Override
    public double volume(){
        return getWidth()*getLength()*getHeight();
    }
}
