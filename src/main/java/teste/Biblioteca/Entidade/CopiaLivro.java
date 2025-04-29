
package teste.Biblioteca.Entidade;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

/**
 *
 * @author venilson.rocha
 */
@Entity
@SequenceGenerator(name = "SEQ_LIVRO", sequenceName = "SEQ_LIVRO", initialValue = 1)

public class CopiaLivro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String situacao;

    @OneToMany(mappedBy = "copiaLivro")
    private List <ItemEmprestimo> itensEmprestimo;

    @ManyToOne
    private Livro livro;

    public CopiaLivro(Livro livro, String situacao) {
        this.livro = livro;
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

   public Livro getLivro() {
      return livro;
    }

  public void setLivro(Livro livro) {
      this.livro = livro;
    }
    
}
