package com.company;
import java.util.ArrayList;
import java.util.List;

public class App implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<String> Message = new ArrayList<>();

    public void addMessage(String Message){
        this.Message.add(Message);
        notifyAllObservers();
    }

    public void removeMessage(String Message){
        this.Message.remove(Message);
        notifyAllObservers();
    }
    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observ: this.observers){
            observ.update(this.Message);
        }
    }
}
