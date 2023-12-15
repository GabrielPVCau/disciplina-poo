public class Crocodilo extends Animal implements VerifInterface {

    private String escama;
    private String dente;
    private int dentes;

    public Crocodilo() {
        escama = "";
        dente = "";
        dentes = 0;
    }

    public Crocodilo(String escama, String dente, int dentes) {
        this.escama = escama;
        this.dente = dente;
        this.dentes = dentes;
    }

    //------------Polimorfismo Sobrescrita------------  
    public void testeSobrescrita() {
        System.out.println("\nObjeto Crocodilo e animal criado");
    }
    //-----------------------------------------------  

    public void call_Teste_Sobrescrita() {
        super.testeSobrescrita();
    }

    //Metodo da interface
    public void dados() {
        System.out.println("\nO metodo dados da interface foi executado");
    }

    public String getEscama() {
        return escama;
    }

    public void setEscama(String escama) {
        this.escama = escama;
    }

    public String getDente() {
        return dente;
    }

    public void setDente(String dente) {
        this.dente = dente;
    }

    public int getDentes() {
        return dentes;
    }

    public void setDentes(int dentes) throws DentesNaoNegativoException {
        if (dentes >= 0) {
            this.dentes = dentes;
        } else {
            throw new DentesNaoNegativoException();
        }

    }

}
