import java.util.*;

public class TebakAngkaGambar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("PROGRAM TEBAK GAMBAR/ANGKA");
		System.out.println("Masukkan Tebakan Anda [1. Gambar 0. Angka]");
		int tebakanUser = sc.nextInt();
		
		System.out.println("ANDA MENEBAK = ");
		if(tebakanUser==1)
			System.out.println("GAMBAR");
		else
			System.out.println("ANGKA");
		int pcOut = (int) (Math.random()+0.5);
		
		System.out.println("Komputer Menghasilkan");
		if(pcOut==1)
			System.out.println("GAMBAR");
		else
			System.out.println("ANGKA");
			
		if(tebakanUser==pcOut)
			System.out.println("ANDA MENANG");
		else
			System.out.println("ANDA KALAH");
		
	}
} 