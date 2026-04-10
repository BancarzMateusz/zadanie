public class Produkt{
	String nazwa;
	int cena;
	int ilosc;
	public Produkt(String nazwa, int cena, int ilosc){
		this.nazwa = nazwa;
		this.cena = cena;
		this.ilosc = ilosc;
}
public void wyswietl(){
	System.out.println(nazwa + " "+ cena + " "+ ilosc);
}

}
