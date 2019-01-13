public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance()
    {
        if (instance == null) {//只有没创建才进行线程同步
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    private int a;
    public void setA(int a)
    {
        this.a = a;
    }
    public int getA()
    {
        return a;
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setA(1);
        System.out.println(s.getA());

        Singleton sAnother = Singleton.getInstance();
        sAnother.setA(2);
        System.out.println(s.getA());
    }
}
