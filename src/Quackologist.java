
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("I saw " + quackObservable + " quacked");
    }
}
