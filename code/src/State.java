interface State
{
    void method();
}

class StateA implements State
{
    private ContextOfState contextOfState;
    public StateA(ContextOfState contextOfState)
    {
        this.contextOfState = contextOfState;
    }
    @Override
    public void method() {
        System.out.println("do something in StateA");
        System.out.println("change state to StateB");
        contextOfState.setState(contextOfState.getStateB());
    }
}

class StateB implements State
{
    private ContextOfState contextOfState;
    public StateB(ContextOfState contextOfState)
    {
        this.contextOfState = contextOfState;
    }
    @Override
    public void method() {
        System.out.println("do something in StateB");
        System.out.println("change state to StateA");
        contextOfState.setState(contextOfState.getStateA());
    }
}

class ContextOfState
{
    private State state;
    private State stateB;
    private State stateA;

    public ContextOfState()
    {
        stateA = new StateA(this);
        stateB = new StateB(this);
        state = stateA;
    }

    public void setState(State state)
    {
        this.state = state;

    }
    public State getStateB()
    {
        return stateB;
    }
    public State getStateA()
    {
        return stateA;
    }
    public void doSomethingByState()
    {
        state.method();
    }
}

class StateUseCase {
    public static void main(String[] args) {
        ContextOfState c = new ContextOfState();
        c.doSomethingByState();
        c.doSomethingByState();
    }
}
