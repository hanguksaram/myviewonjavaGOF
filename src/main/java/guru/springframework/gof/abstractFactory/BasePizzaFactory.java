package guru.springframework.gof.abstractFactory;


import guru.springframework.gof.abstractFactory.product.Pizza;
import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(PizzaType type, Cheese cheese, Sauce sauce);
}
