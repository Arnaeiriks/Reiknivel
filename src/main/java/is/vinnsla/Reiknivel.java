package is.vinnsla;


public class Reiknivel extends Subject {

    public static final Reikna[] virkjar = {
            new BaetaVidReikna(),
            new DragaFraReikna(),
            new MargfaldaReikna(),
            new DeilaReikna()
    };

    public int utkoma = 0;
    public int tala = 0;

    private Reikna virki = virkjar[0];

    public void setTala(int tala) {
        this.tala = this.tala * 10 + tala;
        notifyObservers();
    }

    public void hreinsa() {
        utkoma = 0;
        tala = 0;
        virki= virkjar[0];
        notifyObservers();
    }

    public void setVirki(int virkiNr) {
        utkoma = reikna();
        tala = 0;
        virki = virkjar[virkiNr];
        notifyObservers();
    }

    public int jafntOg() {
        tala = reikna();
        virki = virkjar[0];
        utkoma = 0;
        notifyObservers();
        return tala;
    }

    public int reikna() {
        notifyObservers();
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
