import java.util.List;
import java.util.ArrayList;

public class TstColect {

    private static Leitura l = new Leitura();

    private static Crocodilo crocodilo;

    private static List<Crocodilo> bdCroc = new ArrayList<Crocodilo>();

    public static void main(String arg[]) {

        //Armazena os Crodilos em uma lista
        while (true) {
            crocodilo = new Crocodilo();
            crocodilo.setPatas(Integer.parseInt(l.entDados("Patas: ")));
            crocodilo.setRaca(l.entDados("Raca: "));
            bdCroc.add(crocodilo);

            String resp = l.entDados("\n Deseja continuar a Cadastrando crocodilos (N para sair): ");
            if (resp.equalsIgnoreCase("N")) {
                break;
            }
        }

        //Printa todos dados armazenados
        for (int i = 0; i < bdCroc.size(); i++) {
            System.out.println("\n\nPatas: " + bdCroc.get(i).getPatas()
                    + "\nRaca: " + bdCroc.get(i).getRaca()
                    + "\nValor Armazenado em: " + i);
        }

        //Confere se tem o valor desejado dentro de sua lista
        Crocodilo c2 = new Crocodilo();
        c2.setPatas(Integer.parseInt(l.entDados("\n Consulte o numero de Patas: ")));

        for (int i = 0; i < bdCroc.size(); i++) {
            if (c2.getPatas() == bdCroc.get(i).getPatas()) {
                System.out.println("\n\nPatas: " + bdCroc.get(i).getPatas()
                        + "\nRaca: " + bdCroc.get(i).getRaca()
                        + "\nArmazenado no Indice: " + i);
            }
        }

        //Altera um valor dentro da sua lista
        Crocodilo c3 = new Crocodilo();
        c3.setPatas(Integer.parseInt(l.entDados("\n Altere o valor de Patas: ")));

        for (int i = 0; i < bdCroc.size(); i++) {
            if (c3.getPatas() == bdCroc.get(i).getPatas()) {
                c3.setRaca(l.entDados("\nInforme A nova raca "));
                bdCroc.set(i, c3);
            }
        }

        //Printa a nova lista depois da alteracao
        for (int i = 0; i < bdCroc.size(); i++) {
            System.out.println("\n\nPatas: " + bdCroc.get(i).getPatas()
                    + "\nRaca: " + bdCroc.get(i).getRaca()
                    + "\nArmazenado no Indice: " + i);
        }

        //Exclui um valor da Lista
        Crocodilo p4 = new Crocodilo();
        p4.setPatas(Integer.parseInt(l.entDados("\nPatas a ser excluida: ")));

        for (int i = 0; i < bdCroc.size(); i++) {
            if (p4.getPatas() == bdCroc.get(i).getPatas()) {
                bdCroc.remove(bdCroc.get(i)); //exclui a primeira ocorrencia do objeto
            }
        }

        //printa a Lista após a exclusaoo
        for (int i = 0; i < bdCroc.size(); i++) {
            System.out.println("\n\nPatas: " + bdCroc.get(i).getPatas()
                    + "\nRaca: " + bdCroc.get(i).getRaca()
                    + "\nArmazenado no Indice: " + i);
        }

        //Exclui o objeto desejado atraves do indice
        int i2 = Integer.parseInt(l.entDados("\n Informe o INDICE que deseja EXCLUIR"));
        bdCroc.remove(i2);

        //Printa essa Alteracao
        for (int i = 0; i < bdCroc.size(); i++) {
            System.out.println("\n\nPatas: " + bdCroc.get(i).getPatas()
                    + "\nRaca:  " + bdCroc.get(i).getRaca()
                    + "\nArmazenado no Indice: " + i);
        }

    }

}
