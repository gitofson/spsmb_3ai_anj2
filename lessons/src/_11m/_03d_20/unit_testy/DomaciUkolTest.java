package _11m._03d_20.unit_testy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DomaciUkolTest {

    @Test
    public void obsahObdelnika() {
        assertEquals(1, DomaciUkol.obsahObdelnika(1,1));
    }

    @Test
    public void obsahPravouhlehoTrojuhelnika() {
    }

    @Test
    public void obvodPravouhlehoTrojuhelnika() { assertEquals(7,DomaciUkol.obvodPravouhlehoTrojuhelnika(2,2));
    }


    @Test
    public void objemKoule() {
    }

    @Test
    public void obsahKruhu() {
        double x = DomaciUkol.obsahKruhu(1);
        assertEquals(true, 3.13 <= x && x <= 3.15);
    }

    @Test
    public void obvodKruhu() {
    }

    @Test
    public void povrchkrychle() {
    }

    @Test
    public void objemKrychle() {
    }

    @Test
    public void printBoard() {
    }

    @Test
    public void faktorial() {
    }

    @Test
    public void faktorialRekurzivne() {
    }

    @Test
    public void povrchKoule() {
    }
}