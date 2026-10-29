package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveElogiarEquipeSuporte() {
        Usuario aluno = new Usuario();
        assertEquals("A Central de Atendimento agradece seu contato.\nA Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Equipe de Suporte agradece a mensagem: Ótimo atendimento",
                aluno.elogiarEquipeSuporte("Ótimo atendimento"));
    }

    @Test
    void deveReclamarEquipeSuporte() {
        Usuario aluno = new Usuario();
        assertEquals("A Central de Atendimento agradece seu contato.\nA Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Equipe de Suporte vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                aluno.reclamarEquipeSuporte("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirEquipeSuporte() {
        Usuario aluno = new Usuario();
        assertEquals("A Central de Atendimento agradece seu contato.\nA Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Equipe de Suporte vai analisar a sugestão: Ampliar horário funcionamento",
                aluno.sugerirEquipeSuporte("Ampliar horário funcionamento"));
    }

}