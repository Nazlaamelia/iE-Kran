public class keranHidup implements State {
   private IeKran ieKran; 
    //Method contructor
    public keranHidup (IeKran ieKran) {
        this.ieKran = ieKran;
        ieKran.setState(ieKran.getKeranMati());
    }

    public void volumeAir() {
        System.out.println("Bak hampir habis");
    }

    public void jenisAir() {
        System.out.println("Bak sedang diisi dengan air..");
    }
    public void turn() {

    }

}
