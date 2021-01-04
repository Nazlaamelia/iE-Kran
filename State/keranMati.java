public class keranMati implements State {
    private IeKran ieKran;
    //Method contructor
    public keranMati(IeKran ieKran) {
        this.ieKran = ieKran;        
    }

    public void volumeAir() {
        System.out.println("Bak telah penuh");
    }
     public void jenisAir() {
        System.out.println("Bak tidak diisi dengan air..");
    }

}
