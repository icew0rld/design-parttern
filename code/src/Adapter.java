public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }
    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }
}

interface Target
{
    void targetMethod();
}

interface Adaptee
{
    void adapteeMethod();
}

class ConcreteAdaptee implements Adaptee
{

    @Override
    public void adapteeMethod() {
        System.out.println(ConcreteAdaptee.class + " adapteeMethod");
    }
}

class AdapterUseCase
{
    public static void main(String[] args) {
        useTarget(new Adapter(new ConcreteAdaptee()));
    }

    public static void useTarget(Target t)
    {
        t.targetMethod();
    }
}
