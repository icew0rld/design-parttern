interface Prototype {
    Prototype cloneMethod();
    void operation();
}

class ConcretePrototype implements Prototype
{

    @Override
    public Prototype cloneMethod()
    {
        return new ConcretePrototype();
    }

    @Override
    public void operation()
    {
        System.out.println(ConcretePrototype.class + " operation");
    }
}

class Client
{
    private Prototype prototype;
    public Client(Prototype prototype)
    {
        this.prototype = prototype;
    }

    public void doSomethingWithPrototype()
    {
        Prototype p = prototype.cloneMethod();
        p.operation();
        Prototype p2 = prototype.cloneMethod();
        p2.operation();
    }
}

class PrototypeUseCase
{
    public static void main(String[] args) {
        Client c = new Client(new ConcretePrototype());
        c.doSomethingWithPrototype();
    }
}
