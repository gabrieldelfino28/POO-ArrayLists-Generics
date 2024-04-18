package controller;

import model.Prova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProvaController implements IAvaliacaoController<Prova> {
    private List<Prova> lista;

    public ProvaController() {
        lista = new ArrayList<>();
    }
    @Override
    public void addAvaliacao(Prova prova) {
        lista.add(prova);
    }

    @Override
    public void removeAvaliacao(int indice) {
        Prova prv = lista.get(indice);
        lista.remove(prv);
    }

    @Override
    public Prova consultaAvaliacao(int indice) {
        return lista.get(indice);
    }

    @Override
    public void limpaLista() {
        System.out.println("Limpando a lista...");
        lista.clear();
    }

    @Override
    public void printLista() {
        System.out.println(Arrays.toString(lista.toArray()));
    }
}
