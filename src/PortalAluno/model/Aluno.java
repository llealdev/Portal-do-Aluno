
package PortalAluno.model;

/**
 *
 * @author Matheus Leal
 */
public class Aluno {
    
    // Delcaando variáveis que compõe o aluno
    private String nome;
    private String email;
    private String curso;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, String email, String curso){
        this.nome = nome;
        this.email = email; 
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
