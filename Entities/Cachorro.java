public class Cachorro extends Animal {

    private String pelo;
    private String latido;
    private String habilidade;

    public Cachorro() {
        pelo = "";
        latido = "";
        habilidade = "";
    }

    public Cachorro(String pelo, String latido, String habilidade) {
        this.pelo = pelo;
        this.latido = latido;
        this.habilidade = habilidade;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

}
