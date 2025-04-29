/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.Biblioteca.Entidade;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SequenceGenerator;

/**
 *
 * @author venilson.rocha
 */

 @Entity
 @SequenceGenerator(name = "SEQ_LIVRO", sequenceName = "SEQ_LIVRO", initialValue = 1)
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String titulo;
    private String autor;
    private Date ano;
    private String editora;

    //private List <CopiaLivro> copiasLivro;
    @OneToMany(mappedBy = "livro")
    private List <CopiaLivro> copiasLivro;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Date getAno() {
        return ano;
    }
    public void setAno(Date ano) {
        this.ano = ano;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public List<CopiaLivro> getCopiasLivro() {
        return copiasLivro;
    }
    public void setCopiasLivro(List<CopiaLivro> copiasLivro) {
        this.copiasLivro = copiasLivro;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Livro(Integer id, String titulo, String autor, Date ano, String editora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }
    
}
