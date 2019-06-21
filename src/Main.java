import model.BlackWhitePrint;
import model.ColorPrinter;
import model.Printer;

public class Main {

    public static void main(String[] args){
        Printer p1 = new Printer();
        p1.print();

        ColorPrinter p2 = new ColorPrinter();
        p2.print();
        p2.print(true);

        Printer p3 = new BlackWhitePrint();
        p3.print();
    }
}
