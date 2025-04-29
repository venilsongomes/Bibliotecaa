package teste.Biblioteca.Entidade;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "SEQ_ALUNO", sequenceName = "SEQ_ALUNO", initialValue = 1)

public class Aluno extends Usuario {
    
    
    private String curso;
    @OneToMany(mappedBy = "aluno")
    private List <Emprestimo> emprestimos;

    public Aluno(Integer id, String login, String senha, String nome, String curso) {
        super(id, login, senha, nome);
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
