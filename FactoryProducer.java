public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
         return null;
    }
}
