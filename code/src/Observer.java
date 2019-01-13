import java.util.*;

interface ObserverSubject
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer
{
    void update(int state);
}

class ConcreteObserver implements Observer
{

    @Override
    public void update(int state) {
        System.out.println(ConcreteObserver.class + " " + state);
    }
}

class ConcreteSubject implements ObserverSubject
{
    private List<Observer> observers;
    private int state;

    public ConcreteSubject()
    {
        observers = new ArrayList<>();
        state = 0;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }

    public void updateState(int state) {
        this.state = state;
        notifyObservers();
    }
}

class ObserverUseCase
{
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        ConcreteObserver o = new ConcreteObserver();
        ConcreteObserver o2 = new ConcreteObserver();
        s.registerObserver(o);
        s.registerObserver(o2);
        s.updateState(1);
        s.removeObserver(o);
        s.updateState(2);
    }
}



