import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerAve {

    private Ave ave;
    private List<Ave> bdAve = new ArrayList<Ave>();

    public List<Ave> getBdAve() {
        return bdAve;
    }

    public Ave cadastroAve(Ave ave) {

        if (consultaAvePatas(ave) == null) {
            bdAve.add(ave);
            return ave;
        } else {
            return null;
        }

    }

    // se retornar nulo quer dizer que nao achou a ave
    public Ave consultaAvePatas(Ave ave) {
        for (int i = 0; i < bdAve.size(); i++) {
            if (ave.getPatas() == bdAve.get(i).getPatas()) {
                return bdAve.get(i);
            }
        }
        return null;
    }

    public Ave removerAvePatas(Ave ave) {
        ave = consultaAvePatas(ave);
        if (ave != null) {
            bdAve.remove(ave);
            return null;
        } else {
            return ave;
        }

    }

    public Ave atualizaAvePatas(Ave ave) {
        for (int i = 0; i < bdAve.size(); i++) {
            if (ave.getPatas() == bdAve.get(i).getPatas()) {

                String patas = JOptionPane.showInputDialog(null, "Qual a nova Pata: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String raca = JOptionPane.showInputDialog(null, "Qual a nova Raca: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String macho = JOptionPane.showInputDialog(null, "Qual o novo Numero de Macho: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String femea = JOptionPane.showInputDialog(null, "Qual o novo Numero de Femea: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String alimentacao = JOptionPane.showInputDialog(null, "Qual a sua nova Alimentacao: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String pena = JOptionPane.showInputDialog(null, "Qual situacao da Pena: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String bico = JOptionPane.showInputDialog(null, "Qual o status do bico: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String asa = JOptionPane.showInputDialog(null, "Qual a qualidade das asas: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);

                ave.setPatas(Integer.parseInt(patas));
                ave.setRaca(raca);
                ave.setAlimentacao(alimentacao);
                ave.getQuant().setMacho(Integer.parseInt(macho));
                ave.getQuant().setFemea(Integer.parseInt(femea));
                ave.setPena(pena);
                ave.setBico(bico);
                ave.setAsa(asa);

                bdAve.set(i, ave);
                return bdAve.get(i);
            }
        }
        return null;
    }

}
