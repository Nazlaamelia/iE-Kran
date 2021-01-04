public class airDingin implements State {
    private IeKran ieKran;
    //Method contructor
    public airDingin(IeKran ieKran) {
        this.ieKran = ieKran;
    }

    public void jenisAir() {
        System.out.println("Bak sedang diisi dengan air dingin..");
    }
    public void volumeAir() {
        System.out.println("Bak mulai terisi..");
    }
}
