
public class RubberDuck implements Quackable {

    private Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("Rubber quackk");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RubberDuck";
    }
}
