interface Strategy {
    void algorithm();
}

class ConcreteStrategy implements Strategy
{

    @Override
    public void algorithm() {
        System.out.println(ConcreteStrategy.class + " algorithm");
    }
}

class Context
{
    private Strategy strategy;
    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }
    public void doSomething()
    {
        strategy.algorithm();
    }
}

class StrategyUseCase
{
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStrategy());
        c.doSomething();
    }
}