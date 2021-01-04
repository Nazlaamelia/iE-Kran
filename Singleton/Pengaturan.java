import java.time.LocalTime;

public class Pengaturan {
LocalTime time;
String jenisAir; 

    private static Pengaturan uniqueInstance;

    private Pengaturan() {}

    public static Pengaturan getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Pengaturan();
        }
        return uniqueInstance;
    }

    public LocalTime getJadwal() {
        time = LocalTime.now();
        return time;
    }

    public void setJadwal(LocalTime jadwal){
        this.time = jadwal;
    }

    public String getJenisAir() {
        return jenisAir;
    }

    public void setJenisAir(String jenis){
        this.jenisAir = jenis;
    }
}
