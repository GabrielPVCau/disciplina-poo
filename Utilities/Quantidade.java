public class Quantidade {

    private int macho;
    private int femea;

//------------Polimorfismo SobreCarga------------
    public Quantidade() {
        macho = 0;
        femea = 0;
    }

    public Quantidade(int macho, int femea) {
        this.macho = macho;
        this.femea = femea;
    }
//-----------------------------------------------

    public int getMacho() {
        return macho;
    }

    public void setMacho(int macho) {
        this.macho = macho;
    }

    public int getFemea() {
        return femea;
    }

    public void setFemea(int femea) {
        this.femea = femea;
    }

}
