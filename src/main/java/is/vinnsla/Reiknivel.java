package is.vinnsla;

public class Reiknivel {



    public static final Reikna[] virkjar = {
            Integer::sum,
            (x, y) -> x - y,
            (x, y) -> x * y,
            (x, y) -> y == 0 ? 0 : x / y
    };

    public int utkoma = 0;
    public int tala = 0;

    private Reikna virki = virkjar[0];


    public void setTala(int tala) {
        this.tala = this.tala * 10 + tala;
    }

    public void hreinsa() {
        utkoma = 0;
        tala = 0;
        virki= virkjar[0];
    }

    public void setVirki(int virkiNr) {
        utkoma = reikna();
        tala = 0;
        virki = virkjar[virkiNr];
    }

    public int jafntOg() {
        tala = reikna();
        virki = virkjar[0];
        utkoma = 0;
        return tala;
    }

    public int reikna() {
        return virki.reikna(utkoma, tala);
    }

    public void setUtkoma(int i) {
        utkoma = i;
    }

    public int getTala() {
        return tala;
    }

    public int getUtkoma() {
        return utkoma;
    }

    public Reikna getVirki() {
        return virki;
    }
}
