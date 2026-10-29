package padroescomportamentais.mediator;

public class Solicitante {

    public String elogiarEquipeSuporte(String mensagem) {
        return CentralAtendimento.getInstancia().receberElogioEquipeSuporte(mensagem);
    }

    public String reclamarEquipeSuporte(String mensagem) {
        return CentralAtendimento.getInstancia().receberReclamacaoEquipeSuporte(mensagem);
    }

    public String sugerirEquipeSuporte(String mensagem) {
        return CentralAtendimento.getInstancia().receberSugestaoEquipeSuporte(mensagem);
    }


}
