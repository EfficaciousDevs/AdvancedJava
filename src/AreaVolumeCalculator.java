import java.util.Scanner;
public class AreaVolumeCalculator {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[2];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 2; ++i) {
            String shapeName = scanner.next();
            Shape shapeobj = null;

            switch (shapeName) {
                case "Triangle": {
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();

                    shapeobj = new Triangle();
                    ((Triangle) shapeobj).setBase(base);
                    ((Triangle) shapeobj).setHeight(height);
                    break;
                }
                case "Rectangle": {
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();

                    shapeobj = new Rectangle();
                    ((Rectangle) shapeobj).setLength(length);
                    ((Rectangle) shapeobj).setWidth(width);
                    break;
                }
                case "Cube": {
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();

                    shapeobj = new Cube();
                    ((Cube) shapeobj).setLength(length);
                    ((Cube) shapeobj).setWidth(width);
                    ((Cube) shapeobj).setHeight(height);
                    break;
                }
                case "Sphere": {
                    double radius = scanner.nextDouble();

                    shapeobj = new Sphere();
                    ((Sphere) shapeobj).setRadius(radius);
                    break;
                }
            }

            shapeArray[i] = shapeobj;
        }

        for (Shape shape : shapeArray) {
            System.out.println("Area " + shape.area());

            if (shape instanceof Spatial) {
                double volume = shape.volume();
                System.out.println("Volume " + volume);
            }
        }
    }
    }
