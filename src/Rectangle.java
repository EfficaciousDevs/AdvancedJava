public class Rectangle extends Shape {
    private double length;
    private double width;

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
        return getLength()*getWidth();
    }

    @Override
    public double volume() {
        return -1;
    }
}
