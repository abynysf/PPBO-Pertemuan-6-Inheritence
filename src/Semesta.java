public class Semesta {
    private RasiBintang rasiBintang;

    public Semesta(RasiBintang rasiBintang) {
        this.rasiBintang = rasiBintang;
    }

    public String findRasiBintang(int besar, int kecil, int nodeLepas) {
        Bintang bintang = rasiBintang.findBintang(besar, kecil, nodeLepas);
        if (bintang != null) {
            return bintang.getNama();
        } else {
            return "Bintang tidak ditemukan!";
        }
    }
}