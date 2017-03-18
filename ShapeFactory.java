public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Rectable")) {
            return new Rectangle();
        }
        if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


}
