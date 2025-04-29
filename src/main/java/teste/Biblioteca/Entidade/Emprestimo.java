package teste.Biblioteca.Entidade;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Emprestimo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dataEmprestimo;
    private Date data_entrega;
    
    @OneToMany(mappedBy = "emprestimo")
    private List<ItemEmprestimo> itensEmprestimo;

    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Funcionario funcionario;
    
    public Emprestimo(Date dataEmprestimo, Date data_entrega) {
        this.dataEmprestimo = dataEmprestimo;
        this.data_entrega = data_entrega;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }       
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getData_entrega() {
        return data_entrega;
    }
    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

}