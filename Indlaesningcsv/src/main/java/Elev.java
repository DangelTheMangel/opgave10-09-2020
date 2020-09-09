import processing.core.PApplet;
import processing.data.Table;

public class Elev {
    PApplet p;
    public String navn;
    public int karakter;

    Elev(PApplet p, String navn, int karakter){
        this.p = p;
        this.navn = navn;
        this.karakter = karakter;

    }

    public void  udskriv(){
        p.println("Navn: " + navn + "\nKarakter: " + karakter + "\n ");
    }
}
