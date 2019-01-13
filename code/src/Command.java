interface Command {
    void execute();
    void undo();
}

class Receiver
{
    public void doSomething()
    {
        System.out.println("do");
    }

    public void undoSomething()
    {
        System.out.println("undo");
    }
}

class ConcreteCommand implements Command
{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }

    @Override
    public void undo() {
        receiver.undoSomething();
    }
}

class Invoker
{
    private Command command;
    public void setCommand(Command command)
    {
        this.command = command;
    }
    public void doSomethingWithCommand()
    {
        command.execute();
        command.undo();
    }
}

class CommandUseCase
{
    public static void main(String[] args) {
        Command c =  new ConcreteCommand(new Receiver());
        Invoker i = new Invoker();
        i.setCommand(c);
        i.doSomethingWithCommand();
    }
}

