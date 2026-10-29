package padroescomportamentais.integracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import padroescomportamentais.chainofresponsability.*;
import padroescomportamentais.templatemethod.*;

class ProcessadorChamadosTest {
    @Test
    void deveProcessarChamado() {
        AtendimentoBasico atendimento = new AtendimentoBasico();
        atendimento.setAvaliacao1(6.0f);
        atendimento.setAvaliacao2(6.0f);
        String resultado = new ProcessadorChamados().processar(
            new Chamado(TipoChamadoAcesso.getTipoChamadoAcesso()), 80.0f, 20.0f, atendimento);
        assertEquals("Suporte N1 | Custo: 100.0 | Concluido", resultado);
    }
}
