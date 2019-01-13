public class PizzaTypeA implements Pizza {

    @Override
    public void method1() {
        System.out.println(PizzaTypeA.class + " " + "method1");
    }

    @Override
    public void method2() {
        System.out.println(PizzaTypeA.class + " " + "method2");
    }
}
