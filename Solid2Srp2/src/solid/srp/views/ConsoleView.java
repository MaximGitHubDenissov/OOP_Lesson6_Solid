package solid.srp.views;
import java.util.Scanner;

import solid.srp.models.Order;

public class ConsoleView {

    public Order inputFromConsole(){
        Order ord = new Order(prompt("Client name: "), prompt("Product: "),Integer.parseInt(prompt("Quantity: ")), Integer.parseInt(prompt("Price: ")));
        return ord;
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
