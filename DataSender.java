import java.util.ArrayList;
import java.util.List;

class DataSender implements Observable
{
    private List<Observer> observers =  new ArrayList<Observer>();
    private int data; 
    
    @Override
    public void registerObserver(Observer ob) {
    		observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) { 
    	observers.remove(ob); 
    }

    @Override
    public void notifyObservers(){ 
    	for (Observer observer : observers) {
    		observer.update (data); 
    	}  
    }
         
    public void setData (int data){
        this.data = data;
        notifyObservers();
    }
}
