public class Semesta extends RasiBintang {
    private RasiBintang rasiBintang;

    public Semesta(RasiBintang rasiBintang) {
        this.rasiBintang = rasiBintang;
    }

    public String findRasiBintang(int BintangBesar, int BintangKecil, int nodeLepas) {
        Bintang bintang = rasiBintang.findBintang(BintangBesar, BintangKecil, nodeLepas);
        if (bintang != null) {
            return bintang.getNama();
        } else {
            return "Bintang tidak ditemukan!";
        }
    }
}