package factorymethod;

public class SofaFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Sofa();
    }
}
