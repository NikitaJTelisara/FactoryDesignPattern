public class Test {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color = colorFactory.getColor("red");
        color.fill();
    }
}
