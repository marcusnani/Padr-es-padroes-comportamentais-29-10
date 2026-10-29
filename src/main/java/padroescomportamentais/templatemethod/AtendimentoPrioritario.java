package padroescomportamentais.templatemethod;

public class AtendimentoPrioritario extends Atendimento {

    public String verificarConclusao() {
        if (this.calcularAvaliacao() >= 7.0f) {
            return "Concluido";
        }
        else {
            return "Pendente";
        }
    }

    @Override
    public String getTipo() {
        return "AtendimentoPrioritario";
    }
}
