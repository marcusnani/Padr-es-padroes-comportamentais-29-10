package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoPrioritarioTest {

    @Test
    void deveRetonarConcluido() {
        AtendimentoPrioritario aluno = new AtendimentoPrioritario();
        aluno.setAvaliacao1(7.0f);
        aluno.setAvaliacao2(7.0f);
        assertEquals("Concluido", aluno.verificarConclusao());
    }

    @Test
    void deveRetonarPendente() {
        AtendimentoPrioritario aluno = new AtendimentoPrioritario();
        aluno.setAvaliacao1(7.0f);
        aluno.setAvaliacao2(6.9f);
        assertEquals("Pendente", aluno.verificarConclusao());
    }

    @Test
    void deveRetornarInformacoes() {
        AtendimentoPrioritario aluno = new AtendimentoPrioritario();
        aluno.setAvaliacao1(7.0f);
        aluno.setAvaliacao2(7.0f);
        aluno.setNome("Marco");
        aluno.setProtocolo(1);
        assertEquals("AtendimentoPrioritario{protocolo=1, nome='Marco', resultado=Concluido}", aluno.getInfo());
    }
}