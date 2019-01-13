interface Builder {
    void buildPartA();
    void buildPartB();
}

class ConcreteBuilder implements Builder
{
    private String product = "";

    /**
     * 表示
     */
    @Override
    public void buildPartA() {
        product += "parta";
    }

    @Override
    public void buildPartB() {
        product += "+partb";
    }

    public String getProduct()
    {
        return product;
    }
}

class Director
{
    private Builder builder;
    public Director(Builder builder)
    {
        this.builder = builder;
    }

    /**
     * 逻辑
     */
    public void constructProduct()
    {
        builder.buildPartA();
        builder.buildPartB();
    }
}

class BuilderUseCase
{
    public static void main(String[] args) {
        ConcreteBuilder b = new ConcreteBuilder();
        Director d = new Director(b);
        d.constructProduct();
        System.out.println(b.getProduct());
    }
}

