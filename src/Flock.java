

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        for(Quackable quackable: quackables){
            quackable.quack();
            if(!(quackable instanceof Flock)){
                notifyObservers();
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quackable : quackables){
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
