package factoryMethod.example1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    static List<Window> windows = new ArrayList<>();

    public static void main(String[] args) {

        Supplier[] creators = new Supplier[] {
                new Supplier(), new CompanyA(), new CompanyB(),
                new GenericSupplier(MetalFrameWindow.class)
        };

        for (Supplier c : creators)
            c.install().open();

        //Выводит список всех установленных окон
        System.out.println("Установленные окна: ");
        for (Window w: windows)
            System.out.println(w);

    }
}
