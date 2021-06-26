public class Triangle extends Shape{
    private double base;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double area(){
        return 0.5*getBase()*getHeight();
    }

    @Override
    public double volume() {
        return - 1;
    }
}
