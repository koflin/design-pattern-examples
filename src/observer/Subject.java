package observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeOverserver(Observer observer);
    void notifyObservers();
}
