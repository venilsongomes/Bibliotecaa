/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.Biblioteca.Entidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
/**
 *
 * @author venilson.rocha
 */

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS)// indica herança de classe
@SequenceGenerator(name = "SEQ_USUARIO", sequenceName = "SEQ_USUARIO", initialValue = 1)
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_USUARIO")
    private Integer id;
    private String login;
    private String senha;
    private String nome;
    
    
    public  Usuario(Integer id, String login, String senha, String nome){
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

