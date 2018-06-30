package guru.springframework.gof.abstractFactory;


import guru.springframework.gof.abstractFactory.product.CheesePizza;
import guru.springframework.gof.abstractFactory.product.PepperoniPizza;
import guru.springframework.gof.abstractFactory.product.Pizza;
import guru.springframework.gof.abstractFactory.product.VeggiePizza;
import guru.springframework.gof.abstractFactory.topping.Cheese;
import guru.springframework.gof.abstractFactory.topping.Sauce;

public class GourmetPizzaFactory extends BasePizzaFactory {

    @Override
    public  Pizza createPizza(PizzaType type, Cheese cheese, Sauce sauce){
        Pizza pizza = null;

        switch (type)
        {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }



        return pizza;
    }
}
