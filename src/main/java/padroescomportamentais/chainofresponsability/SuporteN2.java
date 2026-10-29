package padroescomportamentais.chainofresponsability;

public class SuporteN2 extends Suporte {
    
    public SuporteN2(Suporte superior) {
        listaChamados.add(TipoChamadoSoftware.getTipoChamadoSoftware());
        setSuporteSuperior(superior);
    }
    
    public String getDescricaoNivel() {
        return "Suporte N2";
    }
}
