package padroescomportamentais.integracao;

import padroescomportamentais.chainofresponsability.*;
import padroescomportamentais.strategy.*;
import padroescomportamentais.templatemethod.*;

public class ProcessadorChamados {
    public String processar(Chamado chamado, float valor1, float valor2, Atendimento atendimento) {
        Suporte suporte = new SuporteN1(new SuporteN2(new SuporteN3(new SuporteEspecialista(null))));
        String responsavel = suporte.atenderChamado(chamado);
        Orcamento orcamento = new Orcamento();
        orcamento.somarCusto(valor1, valor2);
        return responsavel + " | Custo: " + orcamento.getCusto() + " | " + atendimento.verificarConclusao();
    }
}
