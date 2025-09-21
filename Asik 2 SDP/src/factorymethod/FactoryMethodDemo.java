package factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        FurnitureFactory chairFactory = new ChairFactory();
        Furniture chair = chairFactory.createFurniture();
        System.out.println(chair.getDescription());

        FurnitureFactory sofaFactory = new SofaFactory();
        Furniture sofa = sofaFactory.createFurniture();
        System.out.println(sofa.getDescription());
    }
}


