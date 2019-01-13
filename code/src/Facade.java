public class Facade {
    public static void main(String[] args) {
        Facade f = new Facade(new SubsystemClassA(), new SubsystemClassB());
        f.niceAndSimple();
    }

    private SubsystemClassA subsystemClassA;
    private SubsystemClassB subsystemClassB;
    public Facade(SubsystemClassA subsystemClassA, SubsystemClassB subsystemClassB)
    {
        this.subsystemClassA = subsystemClassA;
        this.subsystemClassB = subsystemClassB;
    }

    public void niceAndSimple()
    {
        subsystemClassA.doSomething();
        subsystemClassB.doSomething();
    }
}

class SubsystemClassA
{
    public void doSomething()
    {
        System.out.println(SubsystemClassA.class);
    }
}

class SubsystemClassB
{
    public void doSomething()
    {
        System.out.println(SubsystemClassB.class);
    }
}
