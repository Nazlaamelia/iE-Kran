import java.time.LocalTime;

public class jenisAir implements Observer, DisplayElement {
    private float jenisAirSekarang = 25.5f;
    private float jenisAir;
    private keranAir keran;

    public jenisAir(keranAir keran) {
        this.keran = keran;
        keran.registerObserver(this);
    }

    public void update(LocalTime jadwal, float temp, String warnaAir) {
        jenisAir = jenisAirSekarang;
        jenisAirSekarang = temp;

        display();
    }

    public void display() {
        if (jenisAirSekarang < 25 ) {
            System.out.println("Air Panas");
        }
        
        else if (jenisAirSekarang >= 25 &&  jenisAir <= 32 ) {
            System.out.println("Air Normal");
        }
        
        else if (jenisAirSekarang > 32) {
            System.out.println("Air Dingin");
        }
    }
}
