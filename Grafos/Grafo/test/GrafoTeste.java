/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import grafo.Grafo;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11204785
 */
public class GrafoTeste {

    @Test
    public void testg1() throws Exception {
        Grafo g = new Grafo("g1.txt");
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        List<Integer> actual = g.percursoLargura(0);
        assertEquals(expected, actual);

    }

    @Test
    public void testg2() throws Exception {
        Grafo g = new Grafo("g2.txt");
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        List<Integer> actual = g.percursoLargura(0);
        assertEquals(expected, actual);

    }

    @Test
    public void testg3() throws Exception {
        Grafo g = new Grafo("g3.txt");
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        List<Integer> actual = g.percursoLargura(0);
        assertEquals(expected, actual);

    }

    @Test
    public void testg4() throws Exception {
        Grafo g = new Grafo("g4.txt");
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        List<Integer> actual = g.percursoLargura(0);
        assertEquals(expected, actual);

    }

    @Test
    public void testg5() throws Exception {
        Grafo g = new Grafo("g5.txt");
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(4);
        List<Integer> actual = g.percursoLargura(0);
        assertEquals(expected, actual);

    }

    @Test
    public void testG6() throws Exception {
        Grafo g = new Grafo("g6.txt");
        List<Integer> expected = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            expected.add(i);
        }
        List<Integer> actual = g.percursoLargura(0);
        assertEquals(expected, actual);
    }

    public void testG6Profundidade() throws Exception {
        Grafo g = new Grafo("g6.txt");
        String expected = "[0, 1, 2, 5, 6, 3, 7, 4, 8, 9]";
        String actual = g.percursoProfundidade(0).toString();
        assertEquals(expected, actual);
    }
}
