package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    SuporteEspecialista reitor;
    SuporteN3 diretor;
    SuporteN2 coordenador;
    SuporteN1 secretaria;

    @BeforeEach
    void setUp() {
        reitor = new SuporteEspecialista(null);
        diretor = new SuporteN3(reitor);
        coordenador = new SuporteN2(diretor);
        secretaria = new SuporteN1(coordenador);
    }

    @Test
    void deveRetornarSuporteN1ParaAssinaturaHistorico() {
        assertEquals("Suporte N1", secretaria.atenderChamado(new Chamado(TipoChamadoAcesso.getTipoChamadoAcesso())));
    }

    @Test
    void deveRetornarSuporteN2ParaAssinaturaMatricula() {
        assertEquals("Suporte N2", secretaria.atenderChamado(new Chamado(TipoChamadoSoftware.getTipoChamadoSoftware())));
    }

    @Test
    void deveRetornarSuporteN3ParaAssinaturaCertificado() {
        assertEquals("Suporte N3", secretaria.atenderChamado(new Chamado(TipoChamadoServidor.getTipoChamadoServidor())));
    }

    @Test
    void deveRetornarEspecialistaParaAssinaturaDiploma() {
        assertEquals("Especialista", secretaria.atenderChamado(new Chamado(TipoChamadoCritico.getTipoChamadoCritico())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Sem atendimento", secretaria.atenderChamado(new Chamado(TipoChamadoComercial.getTipoChamadoComercial())));
    }

}