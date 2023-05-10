//Nama : PegawaiDanGaji.java 07/05/2023
//Penulis : Ihsan Alif Lazuardi Anwar
//Deskripsi : representasi main program dari PegawaiDanGaji

public class PegawaiDanGaji{
	public static void main(String args[]){
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");

		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}