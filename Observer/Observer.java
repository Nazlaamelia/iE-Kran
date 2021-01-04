import java.time.LocalTime;

public interface Observer {
    public void update(LocalTime jadwal, float temp, String warnaAir);
}
