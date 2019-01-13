import java.util.Arrays;
import java.util.Iterator;

class ConcreteIterator implements java.util.Iterator<Integer> {

    private int[] a;
    private int cur;

    public ConcreteIterator(int[] a)
    {
        this.a = a;
        cur = 0;
    }

    @Override
    public boolean hasNext() {
        return cur < a.length;
    }

    @Override
    public Integer next() {
        return a[cur++];
    }
}

interface Aggregate
{
    java.util.Iterator<Integer> createIterator();
}

class ConcreteAggregate implements Aggregate
{
    private int[] a;

    public ConcreteAggregate()
    {
        a = new int[10];
        Arrays.fill(a, 1);
    }

    @Override
    public java.util.Iterator<Integer> createIterator() {
        return new ConcreteIterator(a);
    }
}

class IteratorUseCase
{
    public static void main(String[] args) {
        Aggregate a =  new ConcreteAggregate();
        Iterator<Integer> i = a.createIterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
    }
}
