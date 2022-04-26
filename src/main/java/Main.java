import ru.zvezdilin.BinOpsFacade;
import ru.zvezdilin.Logger;

public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger();
        log.getInfo("Start programme");
        BinOpsFacade bin = new BinOpsFacade();
        log.getInfo("операнды: ");

        System.out.println("101");
        System.out.println("11101");

        log.getInfo("Операция двоичного умножения");
        System.out.println(bin.mult("101", "11101"));

        log.getInfo("Операция двоичного сложения");
        System.out.println(bin.sum("101", "11101"));

        log.getInfo("End programme");

    }
}
