
public abstract class FactoryMethod
{
    public static void main(String[] args) {
        ConcreteCreatorA a = new ConcreteCreatorA();
        a.orderPizza("typeA");
        a.orderPizza("typeB");

        ConcreteCreatorB b = new ConcreteCreatorB();
        b.orderPizza("typeA");
        b.orderPizza("typeB");
    }

    public void orderPizza(String pizzaType)
    {
        Pizza pizza = createPizza(pizzaType);
        pizza.method1();
        pizza.method2();

    }

    abstract public Pizza createPizza(String pizzaType);
}

class ConcreteCreatorA extends FactoryMethod
{
    @Override
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("typeA")) {
            return new PizzaBJTypeA();
        } else if (pizzaType.equals("typeB")) {
            return new PizzaBJTypeB();
        } else {
            return new PizzaBJTypeA();
        }
    }
}

class ConcreteCreatorB extends FactoryMethod
{
    @Override
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("typeA")) {
            return new PizzaSZTypeA();
        } else if (pizzaType.equals("typeB")) {
            return new PizzaSZTypeB();
        } else {
            return new PizzaSZTypeA();
        }
    }
}

class PizzaBJTypeA implements Pizza
{

    @Override
    public void method1() {
        System.out.println(PizzaBJTypeA.class + " " + "method1");
    }

    @Override
    public void method2() {
        System.out.println(PizzaBJTypeA.class + " " + "method2");
    }
}

class PizzaBJTypeB implements Pizza
{

    @Override
    public void method1() {
        System.out.println(PizzaBJTypeB.class + " " + "method1");
    }

    @Override
    public void method2() {
        System.out.println(PizzaBJTypeB.class + " " + "method2");
    }
}

class PizzaSZTypeA implements Pizza
{

    @Override
    public void method1() {
        System.out.println(PizzaSZTypeA.class + " " + "method1");
    }

    @Override
    public void method2() {
        System.out.println(PizzaSZTypeA.class + " " + "method2");
    }
}

class PizzaSZTypeB implements Pizza
{

    @Override
    public void method1() {
        System.out.println(PizzaSZTypeB.class + " " + "method1");
    }

    @Override
    public void method2() {
        System.out.println(PizzaSZTypeB.class + " " + "method2");
    }
}






