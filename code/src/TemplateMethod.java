abstract class TemplateMethod {
    public void templateMethod()
    {
        method1();
        method2();
    }
    abstract void method1();
    abstract void method2();
}

class ConcreteTemplateMethod extends TemplateMethod
{
    public static void main(String[] args) {
        TemplateMethod t = new ConcreteTemplateMethod();
        t.templateMethod();
    }

    @Override
    void method1() {
        System.out.println("1");
    }

    @Override
    void method2() {
        System.out.println("2");
    }
}
