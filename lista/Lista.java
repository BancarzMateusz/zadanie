import java.util.ArrayList;
public class Lista {
 public static void main(String[] args) {
 ArrayList<Produkt> produkty = new ArrayList<Produkt>();
 produkty.add(new Produkt("Japko", 3, 5));
 produkty.add(new Produkt("Pomarancz", 4,6));
 produkty.add(new Produkt("Terracota pie", 1 ,2));


 System.out.println("Lista produktow: " + produkty);
	for(Produkt produkt : produkty){
	System.out.println(produkt);
}
 }
}
