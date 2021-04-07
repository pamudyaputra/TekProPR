package RestaurantJava;
import java.util.*;

public class RestaurantMain {
		private static int no;
		private static int quantity;
		private static String status;
		private static int total=0;
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Restaurant menu = new Restaurant();
		
		// Looping pesanan
		for (;;){
			// Print Menu
			System.out.println("\t\tMenu"); 
			menu.tampilMenuMakanan(); 
			
			// Print pesan
			System.out.printf("\nApa yang ingin Anda pesan?"); 
			
			// Scan ID menu
			System.out.printf("\nID : ");
			no = in.nextInt();
			
			// Scan quantity
			System.out.printf("\nSebanyak : "); 
			quantity = in.nextInt(); 
			
			// Print pesanan dan pengurangan stock
			menu.pesanMakanan(no, quantity); 
			
			// Track pesanan
			total += menu.hitungHarga(no, quantity);
			
			System.out.println();
			
			// Print menu setelah dikurangi stock
			System.out.println("Menu sekarang:");
			
			// Tampil menu setelah di update
			menu.tampilMenuMakanan();
			
			// Scan perintah
			System.out.printf("\nPesan lagi? (Y/T) : ");
			status = in.next();
			
			// Cek status
			if(status.equalsIgnoreCase("T")){
				break;
			}
		}
		in.close();
		// Print total tagihan
		System.out.println("Total tagihan : Rp" + total);
	}
}
