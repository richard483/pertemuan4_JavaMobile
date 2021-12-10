import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	public Main() {
//		ArrayList<Integer> variableArrList = new ArrayList<>(); //memanggil sebuah class ke dalam variabel
//		//cara memanggil class kedalam variabel ==> [nama class] [nama variabel] = new [nama class];
		
//		Kantor kantor = new Kantor(99, "seng", 4.0);
//		ToiletUmum toiletSPBU = new ToiletUmum();
//		
//
//		
//		toiletSPBU.setJenisTembok("triplek");
//		toiletSPBU.jenisPintu = "seng";
//		toiletSPBU.semprotan = false;
//		toiletSPBU.setLuas(100);
//		
//	
//		System.out.println("Luas bangunan = " + kantor.getLuas());
//		System.out.println("Jenis tembok bangunan = " + kantor.getJenisTembok());
//		System.out.println("Jumlah lantai = " + kantor.getJumlahLantai());
//		System.out.println();
//		System.out.println("Tembok toilet = " + toiletSPBU.getJenisTembok());
//		System.out.println("Jenis pintu bangunan = " + toiletSPBU.jenisPintu);
//		System.out.println("Semprotan? = " + toiletSPBU.semprotan);
//		System.out.println("Luas toilet = " + toiletSPBU.getLuas());
		
		ArrayList<Kantor> arrKantor = new ArrayList<Kantor>();
		Integer inputan;
		do {
			
			System.out.println("Welcome to agen Kantor!");
			System.out.println("1. Create kantor");
			System.out.println("2. View kantor");
			System.out.println("3. Exit");
			System.out.print("Input>>> ");
			inputan = scan.nextInt();
			scan.nextLine();
			
			switch (inputan) {
			case 1: {
				System.out.print("Masukkan luas >> ");
				Integer luas = scan.nextInt();
				scan.nextLine();
				
				System.out.print("Masukkan jenis tembok >> ");
				String tembok = scan.nextLine();
				
				System.out.print("Masukkan jumlah lantai >> ");
				Double lantai = scan.nextDouble();
				scan.nextLine();
				
				Kantor tempKantor = new Kantor(luas, tembok, lantai);
				
				arrKantor.add(tempKantor);
				System.out.println();
				break;
				
			}
			
			case 2:{
				for(int i=0; i< arrKantor.size(); i++) {
					System.out.println("List ke-" + (i+1));
					System.out.println("Luas: " + arrKantor.get(i).getLuas());
					System.out.println("Jenis Tembok: " + arrKantor.get(i).getJenisTembok());
					System.out.println("Jumlah Lantai: " + arrKantor.get(i).getJumlahLantai());
					System.out.println();
				}
			}
			
			default:
				System.out.println("Maaf, untuk saat ini menu belum tersedia");
			}
			
			
			
		}while(inputan != 3);
//		
	}

	public static void main(String[] args) {
		
		new Main();
	}

}
