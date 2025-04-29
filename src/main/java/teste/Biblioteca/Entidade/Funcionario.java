/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.Biblioteca.Entidade;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

/**
 *
 * @author venilson.rocha
 */
@Entity
public class Funcionario extends Usuario {
   @OneToMany(mappedBy = "funcionario")
    private List <Emprestimo> emprestimos;
    public Funcionario(Integer id, String login, String senha, String nome) {
        super(id, login, senha, nome);
    }
}
