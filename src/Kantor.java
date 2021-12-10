import Template.*;
public class Kantor extends Bangunan{//inheritance in java
	// memanggil inheritance, menggunakan keyword "extends" untuk mengambil object parent Class atau super class
	String alamat;
	
	public Kantor(Integer luas, String jenisTembok, Double Jumlahlantai) {
		//konstraktor dijalankan pertama kali ketika class dipanggil
		
		this.setLuas(luas);
		this.setJenisTembok(jenisTembok);
		this.setJumlahLantai(Jumlahlantai);
	}
}
