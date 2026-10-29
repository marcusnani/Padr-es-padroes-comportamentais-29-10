package padroescomportamentais.chainofresponsability;

public class SuporteEspecialista extends Suporte {

    public SuporteEspecialista(Suporte superior) {
        listaChamados.add(TipoChamadoCritico.getTipoChamadoCritico());
        setSuporteSuperior(superior);
    }
    
    public String getDescricaoNivel() {
        return "Especialista";
    }

}
