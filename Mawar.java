public class Mawar extends Plant implements IfacePlant {
    public Mawar() {
        super();
        setJenis();
    }

    public void cekKondisiTumbuh() {
        if(getJumlahAir() >= 4 && getJumlahPupuk() >= 2) {
            tumbuh();
        }
    }
        
    public void tumbuh() {
        if(getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 4);
            setJumlahPupuk(getJumlahPupuk() - 2);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }

    public void setJenis() {
        jenis = "MAWAR";
    }
}
