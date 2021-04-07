package RestaurantJava;

public class Menu {
	private final int menuID; // Nomor identitas menu
	private String menu; // Nama menu
	private double price; // Harga menu
	private int stock; // Stok menu
	
	/* Constructor */
	public Menu(String name, double cost, int st, int id){
		menu = name;
		price = cost;
		stock = st;
		menuID = id;
	}
	
	// Mengambil nama menu
	public String getMenu(){
		return menu;
	}
	
	// Mengambil harga menu
	public double getPrice(){
		return price;
	}
	
	// Mengambil stok menu
	public int getStock(){
		return stock;
	}
	
	// Mengambil nomor identitas menu
	public int getId(){
		return menuID;
	}
	
	// Pengubahan data stok
	public void setStock(int i){
		stock += i;
	}
}
