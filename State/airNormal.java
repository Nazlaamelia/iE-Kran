public class airNormal implements State {
    private IeKran ieKran;
    //Method contructor
    public airNormal(IeKran ieKran) {
        this.ieKran = ieKran;
    }

    public void jenisAir() {
        System.out.println("Bak sedang diisi dengan air normal..");
    }
    public void volumeAir() {
        System.out.println("Bak mulai terisi..");
    }
}
