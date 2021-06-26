public class Sphere extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return 4*Math.PI*(getRadius()*getRadius());
    }

    @Override
    public double volume(){
        return 4*Math.PI*(getRadius()*getRadius()*getRadius())/3;

    }
}
