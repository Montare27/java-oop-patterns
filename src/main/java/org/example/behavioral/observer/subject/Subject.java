package org.example.behavioral.observer.subject;

import org.example.behavioral.observer.observer.Observer;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notif();
}
