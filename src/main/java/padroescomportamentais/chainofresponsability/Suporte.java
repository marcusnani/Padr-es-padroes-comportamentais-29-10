package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList listaChamados = new ArrayList();
    private Suporte suporteSuperior;

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }
    
    public abstract String getDescricaoNivel();
    
    public String atenderChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoNivel();
        }
        else {
            if (suporteSuperior != null) {
                return suporteSuperior.atenderChamado(chamado);
            }
            else 
            {
                return "Sem atendimento";
            }
        }        
    }
}
