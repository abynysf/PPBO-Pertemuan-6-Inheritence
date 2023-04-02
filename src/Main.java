public class Main {
    public static void main(String[] args) {
        RasiBintang rasiBintang = new RasiBintang();
        Semesta semesta = new Semesta(rasiBintang);
        rasiBintang.generate();
        System.out.println(semesta.findRasiBintang(2, 5, 0));
        System.out.println(semesta.findRasiBintang(2, 5, 9));
        System.out.println(semesta.findRasiBintang(4, 7, 4));
    }
}
