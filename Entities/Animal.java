
public abstract class Animal {

    protected int patas;
    protected String raca;
    protected Quantidade quant;
    protected String alimentacao;

//------------Polimorfismo SobreCarga------------    
    public Animal() {
        patas = 0;
        raca = "";
        quant = new Quantidade();
        alimentacao = "";
    }

    public Animal(int patas, String nome, Quantidade quant, String alimentacao) {
        this.patas = patas;
        this.raca = nome;
        this.quant = quant;
        this.alimentacao = alimentacao;
    }

    public void testeSobrecarga(int valor) {
        System.out.println("\nTeste Sobrecarga1");
    }

    public void testeSobrecarga() {
        System.out.println("Teste Sobrecarga2");
    }
//-----------------------------------------------

//------------Polimorfismo Sobrescrita------------  
    public void testeSobrescrita() {
        System.out.println("\nIsso foi chamado atraves da Classe filha Crocodilo");
    }
    //-----------------------------------------------  

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String nome) {
        this.raca = nome;
    }

    public Quantidade getQuant() {
        return quant;
    }

    public void setQuant(Quantidade quant) {
        this.quant = quant;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

}
