import java.util.ArrayList;
import java.util.List;

abstract class CompositeComponent
{
    public void add(CompositeComponent c) throws Exception
    {
        throw new Exception("exception");
    }
    public void remove(CompositeComponent c) throws Exception
    {
        throw new Exception("exception");
    }
    public Iterable<CompositeComponent> getChild(int i) throws Exception
    {
        throw new Exception("exception");
    }

    abstract public void operation();
}

class Leaf extends CompositeComponent
{
    public void operation()
    {
        System.out.println(Leaf.class);
    }

}

class Composite extends CompositeComponent
{
    private List<CompositeComponent> cs;
    public Composite()
    {
        cs = new ArrayList<>();
    }
    public void operation()
    {
        System.out.println(Composite.class);
        for (CompositeComponent c : cs) {
            c.operation();
        }
    }

    public void add(CompositeComponent c)
    {
        cs.add(c);
    }
    public void remove(CompositeComponent c)
    {
        cs.remove(c);
    }
    public Iterable<CompositeComponent> getChild(int i)
    {
        return cs;
    }
}

class CompositeUseCase
{
    public static void main(String[] args) {
        try {
            CompositeComponent root = new Composite();
            root.add(new Leaf());

            CompositeComponent secondLevel = new Composite();
            secondLevel.add(new Leaf());
            secondLevel.add(new Leaf());
            root.add(secondLevel);

            root.operation();

        }catch (Exception e) {

        }
    }
}

