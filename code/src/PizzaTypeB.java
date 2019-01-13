public class PizzaTypeB implements Pizza {
    @Override
    public void method1() {
        System.out.println(PizzaTypeB.class + " " + "method1");
    }

    @Override
    public void method2() {
        System.out.println(PizzaTypeB.class + " " + "method2");
    }
}
