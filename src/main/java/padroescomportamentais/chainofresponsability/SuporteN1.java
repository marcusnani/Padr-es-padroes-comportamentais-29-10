package padroescomportamentais.chainofresponsability;

public class SuporteN1 extends Suporte {
    
    public SuporteN1(Suporte superior) {
        listaChamados.add(TipoChamadoAcesso.getTipoChamadoAcesso());
        setSuporteSuperior(superior);
    }
    
    public String getDescricaoNivel() {
        return "Suporte N1";
    }

}
