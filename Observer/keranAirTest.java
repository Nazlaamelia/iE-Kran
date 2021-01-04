import java.time.LocalTime;

public class keranAirTest {

    public static void main(String[] args) {
        keranAir keran = new keranAir();

        jadwal jw = new jadwal(keran);
        jenisAir jenis = new jenisAir(keran);
        kondisiBakMandi kondisiBak = new kondisiBakMandi(keran);

        keran.setMeasurements(LocalTime.now(), 25, "Coklat");
        keran.setMeasurements(LocalTime.now(), 27, "Bening");
        keran.setMeasurements(LocalTime.now(), 33, "Keruh");
        
    }
}
