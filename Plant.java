class Plant {
    private int statusTumbuh;
    private int jumlahAir;
    private int jumlahPupuk;
    protected String jenis;

    public Plant() {
        statusTumbuh = 0;
        jumlahAir = 0;
        jumlahPupuk = 0;
    }

    public int getJumlahAir(){
        return jumlahAir;
    }

    public void setJumlahAir(int n){
        jumlahAir = n;
    }

    public int getJumlahPupuk(){
        return jumlahPupuk;
    }

    public void setJumlahPupuk(int n){
        jumlahPupuk = n;
    }
        
    public void setStatusTumbuh(int n){
        statusTumbuh = n;
    }

    public void beriAir() {
        jumlahAir++;
        cekKondisiTumbuh();
    }

    public void beriPupuk() {
        jumlahPupuk++;
        cekKondisiTumbuh();
    }

    public void cekKondisiTumbuh() {
        if (jumlahAir >= 3 && jumlahPupuk >= 1) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (statusTumbuh < 4) {
            jumlahAir = jumlahAir - 3;
            jumlahPupuk = jumlahPupuk - 1;
            statusTumbuh++;
        }
    }

    public void displayPlant() {
        //System.out.println(getStatusTumbuhText());
        System.out.format("|Jumlah Air | Jumlah Pupuk | Status Tumbuh |\n");
       // System.out.println();
        System.out.format("|%-11d|%-14d|%-15s|%-9d|%-6d|", +jumlahAir, +jumlahPupuk, getStatusTumbuhText());
        System.out.println();
    }

    public String getStatusTumbuhText() {
        switch (statusTumbuh) {
            case 0:
                return "Benih";
            case 1:
                return "Tunas";
            case 2:
                return "Tanaman Kecil";
            case 3:
                return "Tanaman Dewasa";
        }
        return "Berbunga";
    }

    public int getStatusTumbuh() {
        return statusTumbuh;
    }
    
    public String getImagePath() {
        String tImagePath = "img/seed.png";
        switch (statusTumbuh) {
            case 0:
                tImagePath = "img/seed.png";
                break;
            case 1:
                tImagePath = "img/sprout.png";
                break;
            case 2:
                tImagePath = "img/small.png";
                break;
            case 3:
                tImagePath = "img/big.png";
                break;
            case 4:
                tImagePath = "img/blossom.png";
                break;
        }
        return tImagePath;
    }
}
