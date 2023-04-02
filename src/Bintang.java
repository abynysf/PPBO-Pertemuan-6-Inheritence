public class Bintang {
    private int besar;
    private int kecil;
    private int nodeLepas;
    private String nama;

    public Bintang(int besar, int kecil, int nodeLepas, String nama) {
        this.besar = besar;
        this.kecil = kecil;
        this.nodeLepas = nodeLepas;
        this.nama = nama;
    }

    public int getBesar() {
        return besar;
    }

    public int getKecil() {
        return kecil;
    }

    public int getNodeLepas() {
        return nodeLepas;
    }

    public String getNama() {
        return nama;
    }
}