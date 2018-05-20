/*
 * Created for educational purpose 
 */
package factorypattern;

/**
 *
 * @author Elias
 */
public class FactoryPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FactoryShaper FactoryShaper = new FactoryShaper();
        Shape shape1 = FactoryShaper.getShape("CIRCLE");
        shape1.paint();
        
        Shape shape2 = FactoryShaper.getShape("RECTANGLE");
        shape2.paint();
        Shape shape3 = FactoryShaper.getShape("SQUARE");
        shape3.paint();
    }
    
}
