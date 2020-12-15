public class Melati extends Plant implements IfacePlant {
    public Melati() {
        super();
        setJenis();
    }

    public void cekKondisiTumbuh() {
        if(getJumlahAir() >= 4 && getJumlahPupuk() >= 1) {
            tumbuh();
        }
    }
        
    public void tumbuh() {
        if(getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 4);
            setJumlahPupuk(getJumlahPupuk() - 1);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }

    public void setJenis() {
        jenis = "MELATI";
    }
}
