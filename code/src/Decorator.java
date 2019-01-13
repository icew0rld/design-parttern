interface Component
{
    void method();
}


interface Decorator extends Component {

}

class ConcreteComponent implements Component
{

    @Override
    public void method() {
        System.out.println(ConcreteComponent.class);
    }
}

class ConcreteDecorator implements Decorator
{
    private Component component;
    public ConcreteDecorator(Component component)
    {
        this.component = component;
    }

    @Override
    public void method() {
        System.out.println(ConcreteDecorator.class);
        component.method();
    }
}

class DecoratorUseCase
{
    public static void main(String[] args) {
        ConcreteDecorator cd = new ConcreteDecorator(new ConcreteComponent());
        cd.method();
    }
}