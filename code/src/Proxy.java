interface Subject
{
    void method();
}

class RealSubject implements Subject
{

    @Override
    public void method() {
        System.out.println(RealSubject.class);
    }
}

public class Proxy implements Subject{
    @Override
    public void method() {
        //may create RealSubject
        RealSubject rs = new RealSubject();
        if (true) {
            rs.method();;
        }
    }

    public static void main(String[] args) {
        Proxy p = new Proxy();
        p.method();
    }
}
