import java.time.LocalTime;

public class jadwal implements Observer, DisplayElement {
    private LocalTime jadwalSekarang = LocalTime.now();
    private LocalTime jadwalTerakhir;
    private keranAir keran;

    public jadwal(keranAir keran) {
        this.keran = keran;
        keran.registerObserver(this);
    }

    public void update(LocalTime jadwal, float temp, String warnaAir) {
        jadwalTerakhir = jadwalSekarang;
        jadwalSekarang = jadwal;

        display();
    }

    public void display() {
        System.out.println("jadwal: " + jadwalSekarang);
    }
}
