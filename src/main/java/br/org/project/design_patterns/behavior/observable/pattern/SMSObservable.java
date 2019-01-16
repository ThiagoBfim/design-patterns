package br.org.project.design_patterns.behavior.observable.pattern;

import java.util.Observable;
import java.util.Observer;

public class SMSObservable implements Observer, IObservable {

    private String desc;
    private final String userInfo;
    private final Observable observable;

    public SMSObservable(Observable observable, String userInfo) {
        this.observable = observable;
        this.userInfo = userInfo;
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing of SMS " + userInfo + " to " + ((CommentaryObjectObservable) observable).subjectDetails() + " ...");
        this.observable.addObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing of SMS " + userInfo + " to " + (((CommentaryObjectObservable) observable).subjectDetails()) + " ...");
        this.observable.deleteObserver(this);
        System.out.println("Unsubscribed successfully.");
    }

    @Override
    public void update(Observable o, Object arg) {
        desc = (String) arg;
        display();
    }

    private void display() {
        System.out.println("[" + userInfo + "]: " + desc);
    }

}
