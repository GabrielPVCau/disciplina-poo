import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GerCroco {

    private Crocodilo croco;
    private List<Crocodilo> bdCroco = new ArrayList<Crocodilo>();

    public List<Crocodilo> getBdCroco() {
        return bdCroco;
    }

    public Crocodilo cadastroCrocodilo(Crocodilo croco) {

        if (consultaCrocodiloPatas(croco) == null) {
            bdCroco.add(croco);
            return croco;
        } else {
            return null;
        }

    }

    // se retornar nulo quer dizer que nao achou o crocodilo
    public Crocodilo consultaCrocodiloPatas(Crocodilo croco) {
        for (int i = 0; i < bdCroco.size(); i++) {
            if (croco.getPatas() == bdCroco.get(i).getPatas()) {
                return bdCroco.get(i);
            }
        }
        return null;
    }

    public Crocodilo removerCrocodiloPatas(Crocodilo croco) {
        croco = consultaCrocodiloPatas(croco);
        if (croco != null) {
            bdCroco.remove(croco);
            return null;
        } else {
            return croco;
        }

    }

    public Crocodilo atualizaCrocodiloPatas(Crocodilo croco) {
        for (int i = 0; i < bdCroco.size(); i++) {
            if (croco.getPatas() == bdCroco.get(i).getPatas()) {

                String patas = JOptionPane.showInputDialog(null, "Qual a nova Pata: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String raca = JOptionPane.showInputDialog(null, "Qual a nova Raca: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String macho = JOptionPane.showInputDialog(null, "Qual o novo Numero de Macho: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String femea = JOptionPane.showInputDialog(null, "Qual o novo Numero de Femea: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String alimentacao = JOptionPane.showInputDialog(null, "Qual a sua nova Alimentacao: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);                
                String escama = JOptionPane.showInputDialog(null, "Que tipo é sua escama: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String dente = JOptionPane.showInputDialog(null, "Qual o status do dente: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String dentes = JOptionPane.showInputDialog(null, "Qual a Quantidade de dentes: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);

                croco.setPatas(Integer.parseInt(patas));
                croco.setRaca(raca);
                croco.setAlimentacao(alimentacao);
                croco.getQuant().setMacho(Integer.parseInt(macho));
                croco.getQuant().setFemea(Integer.parseInt(femea));
                croco.setEscama(escama);
                croco.setDente(dente);
                try {
                    croco.setDentes(Integer.parseInt(dentes));
                } catch (DentesNaoNegativoException ex) {
                    JOptionPane.showMessageDialog(null, "Dentes nao podem Ser negativos", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                
                bdCroco.set(i, croco);
                return bdCroco.get(i);
            }
        }
        return null;
    }

}
