package model;

public class Prova {
    private int numQuestoes;
    private float mediaNota;

    public Prova() {
        super();
    }

    public int getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes(int numQuestoes) {
        this.numQuestoes = numQuestoes;
    }

    public float getMediaNota() {
        return mediaNota;
    }

    public void setMediaNota() {
        this.mediaNota = (int) (Math.random() * 10) + 1;
    }

    @Override
    public String toString() {
        return '{'+
                "numQuestoes=" + numQuestoes +
                ";mediaNota=" + mediaNota +
                '}';
    }
}
