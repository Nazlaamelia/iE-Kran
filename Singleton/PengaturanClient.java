import java.time.LocalTime;
public class PengaturanClient {
    public static void main(String[] args) {

        /* lazy instatiaton */
        Pengaturan pengaturan = Pengaturan.getInstance();
        System.out.println("Waktu = " + pengaturan.getJadwal());
        pengaturan.setJadwal(LocalTime.now());
        pengaturan.setJenisAir("Air Normal");
        System.out.println("Jenis Air =" + pengaturan.getJenisAir());
        
    }
}
