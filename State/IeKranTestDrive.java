public class IeKranTestDrive {

    public static void main(String[] args) {
        // nyalakan keran
        IeKran ieKran = new IeKran();
                
        //System.out.println(ieKran);
        ieKran.volumeAir();
        ieKran.jenisAir();

        // pilih air dingin
        ieKran.setState(ieKran.getAirDingin());
        
        //System.out.println(ieKran);
        ieKran.volumeAir();
        ieKran.jenisAir();   

        // matikan keran
        ieKran.setState(ieKran.getKeranMati());

        //System.out.println(ieKran);
        ieKran.volumeAir();
        ieKran.jenisAir();
    }
}
