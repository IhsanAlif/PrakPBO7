//Nama : Pegawai.java 07/05/2023
//Penulis : Ihsan Alif Lazuardi Anwar
//Deskripsi : representasi dasar dari Pegawai

public class Pegawai {
	private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama) {
		this.nama=nama;
	}
	public void tampilData() {
		System.out.printf("Nama : %s, Gaji Pokok : %d\n", nama, gajiPokok);
	}
}