package RestaurantJava;

public class Restaurant {
	private Menu[] menu;
	private static int id=0;
	
	public Restaurant() {
		menu = new Menu[4];
		menu[0] = new Menu("Bala-Bala",1000,20,id);
		Restaurant.nextId();
		menu[1] = new Menu("Gehu",1000,20,id);
		Restaurant.nextId();
		menu[2] = new Menu("Tahu",1000,0,id);
		Restaurant.nextId();
		menu[3] = new Menu("Molen", 1000,20,id);
	}
	
	// Print menu
	public void tampilMenuMakanan(){
		for(int i =0; i<=id;i++){
			if(!isOutOfStock(i)){
				System.out.println(menu[i].getMenu() +"["+menu[i].getStock()+"]"+"\tRp. "+menu[i].getPrice() + "\tID: " + menu[i].getId());
			}
		}
	}
	
	// Cek stok
	public boolean isOutOfStock(int id){
		if(menu[id].getStock() == 0){
			return true;
			}else{
				return false;
		}
	}
	
	// Iterasi
	public static void nextId(){
		id++;
	}
	
	
	public void pesanMakanan(int i, int q){
		if(!isOutOfStock(i)){
		 menu[i].setStock(-1*q);
		 System.out.println("Anda memesan " + menu[i].getMenu()+" sebanyak "+q+", total harga = Rp"+hitungHarga(i,q));
		} else {
			System.out.println("Menu tidak ada atau habis.");
		}
	}
	
	public double hitungHarga(int i, int q){
		return menu[i].getPrice()*q;
	}
	
}

