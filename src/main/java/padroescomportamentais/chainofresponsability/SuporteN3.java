package padroescomportamentais.chainofresponsability;

public class SuporteN3 extends Suporte {

    public SuporteN3(Suporte superior) {
        listaChamados.add(TipoChamadoServidor.getTipoChamadoServidor());
        setSuporteSuperior(superior);
    }
    
    public String getDescricaoNivel() {
        return "Suporte N3";
    }

}
