/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author 11204785
 */
public class GrafoApp {

    public static void main(String[] args) throws Exception {
        System.out.println("Grafos");

        Grafo g = new Grafo("g1.txt");

        System.out.println(g);

        System.out.println(g.percursoLargura(0));

    }
}
