import java.util.ArrayList;
public class Lista {
 public static void main(String[] args) {
 ArrayList<String> produkty = new ArrayList<>();
 produkty.add(new Lista("Japko", 3, 5));
 produkty.add(new Lista("Pomarancz", 4,6));
 produkty.add(new Lista("Terracota pie", 1 ,2));


 System.out.println("Lista produktow: " + produkty);
	for(int x: produkty){
	System.out.println(x);
}
 }
}
