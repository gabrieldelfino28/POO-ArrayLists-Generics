package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Main {

    public static void main(String[] args) {
        //Ambiente de teste
        ProvaController pC = new ProvaController();
        Prova prova;
        System.out.println("Provas:\n");
        for (int j = 1; j <= 15; j++) {
            prova = new Prova();

            int num = (int) (Math.random() * 15) + 1;
            prova.setNumQuestoes(num);
            prova.setMediaNota();
            pC.addAvaliacao(prova);
        }
        System.out.println(pC.consultaAvaliacao(3) + "\n");
        pC.removeAvaliacao(3);
        pC.printLista();
        pC.limpaLista();
        pC.printLista();
        System.out.println("\nAtividades:\n");

        AtividadeController aT = new AtividadeController();
        Atividade atividade;
        String[] Assuntos = {"Política", "Meio-Ambiente", "Finanças", "Ciência", "Cultura", "Saúde", "Esporte", "Literatura"};

        for (int i = 0; i < 15; i++) {
            atividade = new Atividade();

            int pos = (int) (Math.random() * Assuntos.length);
            int num = (int) (Math.random() * 8) + 1;
            atividade.setAssunto(Assuntos[pos].toCharArray());
            atividade.setQtdPaginas(num);
            aT.addAvaliacao(atividade);
        }

        System.out.println(aT.consultaAvaliacao(3) + "\n");
        aT.removeAvaliacao(3);
        System.out.println(aT.consultaAvaliacao(3) + "\n");
        aT.printLista();
        aT.limpaLista();
        aT.printLista();
    }
}
