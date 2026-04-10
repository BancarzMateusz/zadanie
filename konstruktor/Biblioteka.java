public class Biblioteka {
 public static void main(String[] args) {
 Ksiazka mojaKsiazka = new Ksiazka("Wiedźmin", "Sapkowski");

 mojaKsiazka.wyswietl();
 }
}
class Ksiazka {
 String tytul;
 String autor;
 public Ksiazka(String tytul, String autor) {
 this.tytul = tytul;
 this.autor = autor;
 }
 void wyswietl() {
 System.out.println("Książka: " + tytul + " - " + autor);
 }
}
