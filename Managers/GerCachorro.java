import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerCachorro {

    private Cachorro cacho;
    private List<Cachorro> bdCachorro = new ArrayList<Cachorro>();

    public List<Cachorro> getBdCachorro() {
        return bdCachorro;
    }

    public Cachorro cadastroCachorro(Cachorro cacho) {

        if (consultaCachorroPatas(cacho) == null) {
            bdCachorro.add(cacho);
            return cacho;
        } else {
            return null;
        }

    }

    // se retornar nulo quer dizer que nao achou o cachorro
    public Cachorro consultaCachorroPatas(Cachorro cacho) {
        for (int i = 0; i < bdCachorro.size(); i++) {
            if (cacho.getPatas() == bdCachorro.get(i).getPatas()) {
                return bdCachorro.get(i);
            }
        }
        return null;
    }

    public Cachorro removerCachorroPatas(Cachorro cacho) {
        cacho = consultaCachorroPatas(cacho);
        if (cacho != null) {
            bdCachorro.remove(cacho);
            return null;
        } else {
            return cacho;
        }

    }

    public Cachorro atualizaCachorroPatas(Cachorro cachorro) {
        for (int i = 0; i < bdCachorro.size(); i++) {
            if (cachorro.getPatas() == bdCachorro.get(i).getPatas()) {

                String patas = JOptionPane.showInputDialog(null, "Qual a nova Pata: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String raca = JOptionPane.showInputDialog(null, "Qual a nova Raca: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String macho = JOptionPane.showInputDialog(null, "Qual o novo Numero de Macho: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String femea = JOptionPane.showInputDialog(null, "Qual o novo Numero de Femea: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String alimentacao = JOptionPane.showInputDialog(null, "Qual a sua nova Alimentacao: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String pelo = JOptionPane.showInputDialog(null, "Que tipo é seu pelo: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String latido = JOptionPane.showInputDialog(null, "Qual o status do dente: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);
                String habilidade = JOptionPane.showInputDialog(null, "Qual a Quantidade de dentes: ", "Atualizar", JOptionPane.QUESTION_MESSAGE);

                cachorro.setPatas(Integer.parseInt(patas));
                cachorro.setRaca(raca);
                cachorro.setAlimentacao(alimentacao);
                cachorro.getQuant().setMacho(Integer.parseInt(macho));
                cachorro.getQuant().setFemea(Integer.parseInt(femea));
                cachorro.setPelo(pelo);
                cachorro.setLatido(latido);
                cachorro.setHabilidade(habilidade);

                bdCachorro.set(i, cachorro);
                return bdCachorro.get(i);
            }
        }
        return null;
    }

}
