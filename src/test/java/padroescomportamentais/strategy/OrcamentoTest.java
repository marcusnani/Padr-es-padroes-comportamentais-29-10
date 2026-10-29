package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcamentoTest {

    @Test
    void deveSomarCustoOrcamento() {
        Orcamento aluno = new Orcamento();
        aluno.somarCusto(80.0f, 20.0f);
        assertEquals(100.0f, aluno.getCusto());
    }

    @Test
    void deveSubtrairCustoOrcamento() {
        Orcamento aluno = new Orcamento();
        aluno.subtrairCusto(80.0f, 10.0f);
        assertEquals(70.0f, aluno.getCusto());
    }

    @Test
    void deveMultiplicarCustoOrcamento() {
        Orcamento aluno = new Orcamento();
        aluno.multiplicarCusto(80.0f, 1.1f);
        assertEquals(88.0f, aluno.getCusto());
    }

    @Test
    void deveDividirCustoOrcamento() {
        Orcamento aluno = new Orcamento();
        aluno.dividirCusto(100.0f, 2.0f);
        assertEquals(50.0f, aluno.getCusto());
    }

    @Test
    void naoDeveDividirCustoOrcamentoPorZero() {
        try {
            Orcamento aluno = new Orcamento();
            aluno.dividirCusto(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaCustoOrcamento() {
        Orcamento aluno = new Orcamento();
        aluno.calcularMediaCustos(70.0f, 80.0f);
        assertEquals(75.0f, aluno.getCusto());
    }

}