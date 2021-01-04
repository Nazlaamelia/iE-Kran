import java.util.*;
import java.time.LocalTime;

public class keranAir implements Subject {
    private ArrayList<Observer> observers;
    private LocalTime jadwal;
    private float temperature;
    private String warnaAir;

    public keranAir() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(jadwal, temperature, warnaAir);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(LocalTime jadwal, float temperature, String warnaAir) {
        this.jadwal = jadwal;
        this.temperature = temperature;
        this.warnaAir = warnaAir;
        measurementsChanged();
    }

    public LocalTime getJadwal() {
        return jadwal;
    }

    public float getTemperature() {
        return temperature;
    }

    public String getWarnaAir() {
        return warnaAir;
    }


}
