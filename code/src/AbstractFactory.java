
class AbstractFactoryClient
{
    AbstractFactory factory;

    public AbstractFactoryClient(AbstractFactory factory)
    {
        this.factory = factory;
    }

    public void useProducts()
    {
        Product1 product1 = factory.createProduct1();
        Product2 product2 = factory.createProduct2();
        product1.product1Method();
        product2.product2Method();
    }

    public static void main(String[] args) {
        AbstractFactoryClient a = new AbstractFactoryClient(new FactoryA());
        a.useProducts();

        AbstractFactoryClient b = new AbstractFactoryClient(new FactoryB());
        b.useProducts();
    }
}

interface Product1
{
    void product1Method();
}

class Product1A implements Product1
{

    @Override
    public void product1Method() {
        System.out.println(Product1A.class + " " + "product1Method");
    }
}

class Product1B implements Product1
{
    @Override
    public void product1Method() {
        System.out.println(Product1B.class + " " + "product1Method");
    }
}

interface Product2
{
    public void product2Method();
}

class Product2A implements Product2
{

    @Override
    public void product2Method() {
        System.out.println(Product2A.class + " " + "product2Method");
    }
}

class Product2B implements Product2
{

    @Override
    public void product2Method() {
        System.out.println(Product2B.class + " " + "product2Method");
    }
}

interface AbstractFactory {
    Product1 createProduct1();
    Product2 createProduct2();
}

class FactoryA implements AbstractFactory
{

    @Override
    public Product1 createProduct1() {
        return new Product1A();
    }

    @Override
    public Product2 createProduct2() {
        return new Product2A();
    }
}

class FactoryB implements AbstractFactory
{

    @Override
    public Product1 createProduct1() {
        return new Product1B();
    }

    @Override
    public Product2 createProduct2() {
        return new Product2B();
    }
}

