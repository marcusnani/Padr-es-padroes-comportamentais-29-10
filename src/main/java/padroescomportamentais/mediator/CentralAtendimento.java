package padroescomportamentais.mediator;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String receberElogioEquipeSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "A Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeSuporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoEquipeSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "A Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeSuporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoEquipeSuporte(String mensagem) {
        return "A Central de Atendimento agradece seu contato.\n"+
                "A Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeSuporte.getInstancia().receberSugestao(mensagem);
    }

}
