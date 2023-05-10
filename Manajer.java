//Nama : Manajer.java 07/05/2023
//Penulis : Ihsan Alif LAzuardi Anwar
//Deskripsi : representasi dasar dari Manajer IS-A Pegawai

public class Manajer extends Pegawai {
	private int tunjangan = 700000;
	
	public Manajer(String nama) {
		setNama(nama);
	}
	public void tampilData() {
		super.tampilData();
		System.out.printf("Tunjangan : %d\n", tunjangan);
	}
} 