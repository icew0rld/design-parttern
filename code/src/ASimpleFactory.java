public class ASimpleFactory
{
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new ASimpleFactory());
        pizzaStore.orderPizza("typeA");
        pizzaStore.orderPizza("typeB");
    }

    public Pizza createPizza(String pizzaType)
    {
        if (pizzaType.equals("typeA")) {
            return new PizzaTypeA();
        } else if (pizzaType.equals("typeB")) {
            return new PizzaTypeB();
        } else {
            return new PizzaTypeA();
        }
    }
}

class PizzaStore
{
    private ASimpleFactory aSimpleFactory;
    public PizzaStore(ASimpleFactory aSimpleFactory)
    {
        this.aSimpleFactory = aSimpleFactory;
    }
    public void orderPizza(String pizzaType)
    {
        Pizza pizza = aSimpleFactory.createPizza(pizzaType);
        pizza.method1();
        pizza.method2();
    }
}
