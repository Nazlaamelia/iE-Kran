public class airBusa implements State {
    private IeKran ieKran;
    //Method contructor
    public airBusa(IeKran ieKran) {
        this.ieKran = ieKran;
    }

    public void jenisAir() {
        System.out.println("Bak sedang diisi dengan air busa..");
    }
    
    public void volumeAir() {
        System.out.println("Bak mulai terisi..");
    }
}
