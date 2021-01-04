import java.time.LocalTime;

public class kondisiBakMandi implements Observer, DisplayElement {
    private String kondisiBak = "Bersih";
    private String warnaAirBak;
    private keranAir keran;

    public kondisiBakMandi(keranAir keran) {
        this.keran = keran;
        keran.registerObserver(this);
    }

    public void update(LocalTime jadwal, float temp, String warnaAir) {
        warnaAirBak = kondisiBak;
        kondisiBak = warnaAir;

        display();
    }

    public void display() { 
        if (kondisiBak.equals("Bening")) {
            System.out.println("Bersih");
        }

        else if(kondisiBak.equals("Keruh")) {
            System.out.println("Bersih");
        }
        
        else if(kondisiBak.equals("Hijau")) {
            System.out.println("Kotor");
        }

        else if(kondisiBak.equals("Coklat")) {
            System.out.println("Kotor sekali");
        }
    }
}
