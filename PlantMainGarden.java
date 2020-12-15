import java.util.Scanner;
public class PlantMainGarden {
        public static void main(String[] args) {
        //Plant p = new Plant();
        //Anggrek p = new Anggrek();
        Garden mG = new Garden("Kebun Bunga");
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do {
                System.out.println("Masukkan:");
                System.out.println("0 untuk menanam");
                System.out.println("1 untuk memberi air");
                System.out.println("2 untuk memberi pupuk");
                System.out.println("3 untuk memanen");
                System.out.println("999 untuk keluar");
                
                inp = sc.nextInt();
                switch(inp){
                    case 0: Plant p = new Plant();
                            if(mG.addPlant(p)){
                                printMessage("Tanaman berhasil ditambahkan");
                            }else{
                                printMessage("Kebun sudah penuh");
                            }
                            break;
                    case 1: mG.beriAir();
                            break;
                    case 2: mG.beriPupuk();
                            break;
                    case 3: int n = mG.harvestPlant();
                            if(n>0)
                            printMessage(n +"plant(s) successfully harvested!");
                            else
                            printMessage("Oops... There is no plant ready to be harvested.");
                            break;
                        }
                mG.displayPlant();
                        
        }while (inp!=999);

        sc.close();
     }   
    public static void printMessage(String str){
            System.out.println("***************************");
            System.out.println("**"+str);
            System.out.println("***************************");
    }
}
