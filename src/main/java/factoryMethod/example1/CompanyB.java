package factoryMethod.example1;

public class CompanyB  extends Supplier {

    @Override
    public Window createWindow() {
        return new  WoodFrameWindow();
    }
}
