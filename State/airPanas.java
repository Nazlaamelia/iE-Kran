public class airPanas implements State {
    private IeKran ieKran;
    //Method contructor
    public airPanas(IeKran ieKran) {
        this.ieKran = ieKran;
    }

    public void jenisAir() {
        System.out.println("Bak sedang diisi dengan air panas..");
    }
    public void volumeAir() {
        System.out.println("Bak mulai terisi..");
    }
}
