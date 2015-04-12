import java.util.*;

public class WhileDemo00
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan Jumlah Data");
		int max = 0;
		int min = 99;
		double rataRata = 0.0;
		
		int jmlData = input.nextInt();
		int sum = 0;
		int count = 0;
		
		while(count<jmlData){
			sum += input.nextInt();
			count++;
		}
		System.out.println("Sum = " +sum);
		System.out.println("Avg = " +rataRata);
		System.out.println("Max = " +max);
		System.out.println("Min = " +min);
	}
} 