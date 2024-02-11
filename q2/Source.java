//64050030 Kitipum Nornua

import java.util.List;
import java.util.ArrayList;

public abstract class Source {
    private final List<Observer> list = new ArrayList<>();
    
    public void add (Observer observer) {
        list.add(observer);
    }
    public void remove(Observer observer) {
        list.remove(list.indexOf(observer));
    }
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	    }
    }
}
