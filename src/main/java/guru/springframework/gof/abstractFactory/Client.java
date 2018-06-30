package guru.springframework.gof.abstractFactory;

import guru.springframework.gof.abstractFactory.product.Pizza;
import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;

public class Client {
    Cheese cheese;
    Sauce sauce;
    Pizza pizza;
    PizzaType type;

    public Client(PizzaType type ,BasePizzaFactory basePizzaFactory, BaseToppingFactory baseToppingFactory) {

        cheese = baseToppingFactory.createCheese();
        sauce = baseToppingFactory.createSauce();
        basePizzaFactory.createPizza(type, cheese, sauce);

    }

}
