package padroescomportamentais.templatemethod;

public abstract class Atendimento {

    private int protocolo;
    protected String nome;
    private float avaliacao1;
    private float avaliacao2;

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(float avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    public float getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(float avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    public float calcularAvaliacao() {
        return (this.avaliacao1 + this.avaliacao2) / 2;
    }

    public abstract String verificarConclusao();

    public String getTipo() {
        return "Atendimento";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "protocolo=" + this.protocolo +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarConclusao() +
                '}';
    }
}
