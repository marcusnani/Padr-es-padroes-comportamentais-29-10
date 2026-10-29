package padroescomportamentais.mediator;

public interface Equipe {
    String receberReclamacao(String mensagem);
    String receberElogio(String mensagem);
    String receberSugestao(String mensagem);
}
