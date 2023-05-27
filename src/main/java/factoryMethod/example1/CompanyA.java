package factoryMethod.example1;

public class CompanyA  extends Supplier {

    @Override
    public Window createWindow() {
        return new PlasticFrameWindow();
    }
}
