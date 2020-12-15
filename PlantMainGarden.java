import java.util.Scanner;
public class PlantMainGarden {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Garden garden = new Garden();
        garden.displayPlant();

        int pil = 0;
        do {
                System.out.println();
                System.out.println("0. Display Garden");
                System.out.println("1. Tambah Melati");
                System.out.println("2. Tambah Mawar");
                System.out.println("3. Tambah Anggrek");
                System.out.println("4. Beri Air");
                System.out.println("5. Beri Pupuk");
                System.out.println("6. Panen");
                System.out.printf("Pilih: "); pil = sc.nextInt();
                System.out.println();
                switch (pil) {
                        case 0:
                                garden.displayPlant();
                                break;
                        case 1:
                                garden.addPlant(new Melati());
                                break;
                        case 2:
                                garden.addPlant(new Mawar());
                                break;
                        case 3:
                                garden.addPlant(new Anggrek());
                                break;
                        case 4:
                                garden.beriAir();
                                break;
                        case 5:
                                garden.beriPupuk();;
                                break;
                        case 6:
                                System.out.printf("Hasil Panen: %d",garden.harvestPlant());
                                break;
                        default:
                                break;
                }
                
        } while (pil != 999);
        sc.close();
        }
}
