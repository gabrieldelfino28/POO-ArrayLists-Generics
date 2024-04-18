package controller;

import model.Atividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtividadeController implements IAvaliacaoController<Atividade> {
    private List<Atividade> lista;

    public AtividadeController() {
        lista = new ArrayList<>();
    }

    @Override
    public void addAvaliacao(Atividade atividade) {
        lista.add(atividade);
    }

    @Override
    public void removeAvaliacao(int indice) {
        Atividade atv = lista.get(indice);
        lista.remove(atv);
    }

    @Override
    public Atividade consultaAvaliacao(int indice) {
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
