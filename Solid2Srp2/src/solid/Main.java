package solid;

import solid.srp.models.Order;
import solid.srp.repository.Jsonsave;
import solid.srp.views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        ConsoleView cw = new ConsoleView(); 
        Order order = cw.inputFromConsole();
        Jsonsave jsonsave = new Jsonsave();
        jsonsave.saveToJson(order);
    }
}
