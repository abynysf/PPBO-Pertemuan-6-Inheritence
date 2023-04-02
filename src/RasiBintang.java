import java.util.ArrayList;
import java.util.List;

public class RasiBintang {
    private List<Bintang> bintangList;

    public RasiBintang() {
        bintangList = new ArrayList<>();
        //Tambahkan bintang-bintang yang diperlukan
        bintangList.add(new Bintang(1, 4, 0, "Capricorn"));
        bintangList.add(new Bintang(2, 7, 4, "Scorpio"));
        bintangList.add(new Bintang(2, 5, 2, "Gemini"));
        bintangList.add(new Bintang(4, 12, 4, "Sagitarius"));
        bintangList.add(new Bintang(3, 6, 0, "Pisces"));
        bintangList.add(new Bintang(2, 7, 1, "Leo"));
        bintangList.add(new Bintang(1, 5, 3, "Taurus"));
        bintangList.add(new Bintang(2, 5, 0, "Libra"));
        bintangList.add(new Bintang(4, 7, 4, "Virgo"));
        bintangList.add(new Bintang(1, 2, 2, "Aries"));
        bintangList.add(new Bintang(2, 7, 3, "Aquarius"));
        bintangList.add(new Bintang(1, 5, 3, "Cancer"));
    }

    public Bintang findBintang(int besar, int kecil, int nodeLepas) {
        for (Bintang bintang : bintangList) {
            if (bintang.getBesar() == besar && bintang.getKecil() == kecil && bintang.getNodeLepas() == nodeLepas) {
                return bintang;
            }
        }
        return null;
    }
}