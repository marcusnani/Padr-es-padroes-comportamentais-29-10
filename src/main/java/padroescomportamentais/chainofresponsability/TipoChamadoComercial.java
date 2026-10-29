package padroescomportamentais.chainofresponsability;

public class TipoChamadoComercial implements TipoChamado {

    private static TipoChamadoComercial tipoChamadoComercial = new TipoChamadoComercial();

    private TipoChamadoComercial() {};
    
    public static TipoChamadoComercial getTipoChamadoComercial() {
        return tipoChamadoComercial;
    }
}
