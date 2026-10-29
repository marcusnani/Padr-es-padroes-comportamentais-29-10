package padroescomportamentais.templatemethod;

public class AtendimentoBasico extends Atendimento {

    public String verificarConclusao() {
        if (this.calcularAvaliacao() >= 6.0f) {
            return "Concluido";
        }
        else {
            return "Pendente";
        }
    }

}
