package is.vidmot;

import static is.vinnsla.Reiknivel.virkjar;
import static org.junit.Assert.*;

import is.vinnsla.Reikna;
import is.vinnsla.Reiknivel;
import org.junit.Test;

public class ReiknivelTest {

    Reiknivel r;

    @Test
    public void testSetTala() {
        Reiknivel r = new Reiknivel();
        r.setTala(5);
        assertEquals(5, r.tala);

        r.setTala(7);
        assertEquals(57, r.tala);
    }

    @Test
    public void testHreinsa() {
        Reiknivel r = new Reiknivel();
        r.setTala(5);
        r.setUtkoma(10);
        r.hreinsa();
        assertEquals(0, r.tala);
        assertEquals(0, r.utkoma);
    }

    @Test
    public void testSetVirki() {
        Reiknivel r = new Reiknivel();
        r.setVirki(0);
        assertEquals(virkjar[0].toString(), r.getVirki().toString());

        r.setVirki(2);
        assertEquals(virkjar[2].toString(), r.getVirki().toString());
    }

    @Test
    public void testJafntOg() {
        Reiknivel r = new Reiknivel();
        r.setTala(5);
        r.setVirki(0);
        r.setTala(7);
        int result = r.jafntOg();
        assertEquals(12, result);
        assertEquals(0, r.getTala());
        assertEquals(12, r.getUtkoma());
        assertEquals(r.virkjar[0], r.getVirki());
    }


    @Test
    public void testReikna() {
        Reiknivel r = new Reiknivel();
        r.setTala(5);
        r.setVirki(0);
        r.setTala(7);
        int result = r.reikna();
        assertEquals(12, result);
    }

    @Test
    public void testReiknaDeiltMedNull() {
        Reiknivel r = new Reiknivel();
        r.setTala(5);
        r.setUtkoma(10);
        r.setVirki(3);
        int utkoma = r.reikna();
        assertEquals(0, utkoma);
    }

}
