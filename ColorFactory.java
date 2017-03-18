public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("Red")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("Pink")) {
            return new Pink();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
