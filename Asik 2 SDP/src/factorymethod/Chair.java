package factorymethod;

public class Chair implements Furniture {
    @Override
    public String getDescription() {
        return "This is a chair";
    }
}
