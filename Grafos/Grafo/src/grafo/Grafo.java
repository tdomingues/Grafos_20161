/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 11204785
 */
public class Grafo {

    private int dados[][];

    public Grafo(int tamanho) {
        checkTamanho(tamanho);
        dados = new int[tamanho][tamanho];
    }

    public Grafo(String nomeDoArquivo) throws Exception {
        int tamanho;
        String aresta[];
        String linha;
        try (BufferedReader bf = new BufferedReader(new FileReader(new File(nomeDoArquivo)))) {
            tamanho = Integer.parseInt(bf.readLine());
            dados = new int[tamanho][tamanho];

            while ((linha = bf.readLine()) != null) {
                aresta = linha.split(" ");
                addAresta(Integer.parseInt(aresta[0]), Integer.parseInt(aresta[1]));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void addAresta(int origem, int destino) {
        checkOrigem(origem);
        checkDestino(destino);
        dados[origem][destino] = 1;
    }

    private void checkTamanho(int tamanho) {
        if (tamanho <= 0) {
            throw new IllegalArgumentException("O grafo deve ter um ou mais nodos.");
        }
    }

    private void checkDestino(int destino) {
        if (destino < 0 && destino >= dados.length) {
            throw new IllegalArgumentException("O nodo do destino não existe");
        }
    }

    private void checkOrigem(int origem) {
        if (origem < 0 && origem >= dados.length) {
            throw new IllegalArgumentException("O nodo da origem não existe");
        }
    }

    public List<Integer> percursoLargura(int inicio) {
        List<Integer> r = new ArrayList<>();

        List<Integer> fila = new ArrayList<>();
        fila.add(inicio);
        while (!fila.isEmpty()) {
            int nodo = fila.remove(0);
            r.add(nodo);
            for (int i = 0; i < dados.length; i++) {
                if (dados[nodo][i] != 0) {
                    if (!r.contains(i)) {
                        fila.add(i);
                    }
                }
            }

        }

        return r;
    }

    public List<Integer> percursoProfundidade(int inicio) {
        List<Integer> r = new ArrayList<>();
        percursoProfundidade(inicio, r);
        return r;
    }

    private void percursoProfundidade(int nodo, List<Integer> percurso) {
        percurso.add(nodo);
        for (int i = 0; i < dados.length; i++) {
            if (dados[nodo][i] != 0) {
                if (!percurso.contains(i)) { // Evita ciclos!
                    percursoProfundidade(i, percurso);
                }
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < dados.length; i++) {
            for (int j = 0; j < dados.length; j++) {
                s += String.format("%d ", dados[i][j]);
            }
            s += '\n';
        }
        return s;
    }
}

