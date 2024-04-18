package controller;

public interface IAvaliacaoController<T> {
    void addAvaliacao(T t);
    void removeAvaliacao(int indice);
    T consultaAvaliacao(int indice);
    void limpaLista();
    void printLista();
}
