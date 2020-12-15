public class Anggrek extends Plant {
    public Anggrek() {
        super();
        jenis = "ANGGREK";
    }

    public void cekKondisiTumbuh() {
        if(getJumlahAir() >=3 && getJumlahPupuk() >=2) {
            tumbuh();
        }
    }
        
    public void tumbuh() {
        if(getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() - 2);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
     }
}
