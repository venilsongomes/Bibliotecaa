
package teste.Biblioteca.Entidade;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

/**
 *
 * @author venilson.rocha
 */
    @Entity
    @SequenceGenerator(name = "SEQ_ITEM_EMPRESTIMO", sequenceName = "SEQ_ITEM_EMPRESTIMO", initialValue = 1)

    public class ItemEmprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_ITEM_EMPRESTIMO")
    private Integer id;
    private Date data_prevista;
    private Date data_entrega;
 
    @ManyToOne
    private Emprestimo emprestimo;
    @ManyToOne
    private CopiaLivro copiaLivro;

    //@ManyToOne
   // @PrimaryKeyJoinColumn(name = "copia_id")
   // private CopiaLivro copiaLivro;

    public Date getData_prevista() {
        return data_prevista;
    }

    public void setData_prevista(Date data_prevista) {
        this.data_prevista = data_prevista;
    }
    public Date getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

   // public CopiaLivro getCopiaLivro() {
      //  return copiaLivro;
   // }

   // public void setCopiaLivro(CopiaLivro copiaLivro) {
    //    this.copiaLivro = copiaLivro;
   // }
    
}
