package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoBasicoTest {

    @Test
    void deveRetonarConcluido() {
        AtendimentoBasico aluno = new AtendimentoBasico();
        aluno.setAvaliacao1(6.0f);
        aluno.setAvaliacao2(6.0f);
        assertEquals("Concluido", aluno.verificarConclusao());
    }

    @Test
    void deveRetonarPendente() {
        AtendimentoBasico aluno = new AtendimentoBasico();
        aluno.setAvaliacao1(6.0f);
        aluno.setAvaliacao2(5.9f);
        assertEquals("Pendente", aluno.verificarConclusao());
    }

    @Test
    void deveRetornarInformacoes() {
        AtendimentoBasico aluno = new AtendimentoBasico();
        aluno.setAvaliacao1(6.0f);
        aluno.setAvaliacao2(5.9f);
        aluno.setNome("Marcelo");
        aluno.setProtocolo(2);
        assertEquals("Atendimento{protocolo=2, nome='Marcelo', resultado=Pendente}", aluno.getInfo());
    }
}