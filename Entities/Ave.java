public class Ave extends Animal {

    private String pena;
    private String bico;
    private String asa;

    public Ave() {
        pena = "";
        bico = "";
        asa = "";
    }

    public Ave(String pena, String bico, String asa) {
        this.pena = pena;
        this.bico = bico;
        this.asa = asa;
    }

    public String getPena() {
        return pena;
    }

    public void setPena(String pena) {
        this.pena = pena;
    }

    public String getBico() {
        return bico;
    }

    public void setBico(String bico) {
        this.bico = bico;
    }

    public String getAsa() {
        return asa;
    }

    public void setAsa(String asa) {
        this.asa = asa;
    }

}
