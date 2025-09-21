package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        System.out.println(modernChair.sitOn());
        System.out.println(modernSofa.lieOn());

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        System.out.println(victorianChair.sitOn());
        System.out.println(victorianSofa.lieOn());
    }
}
