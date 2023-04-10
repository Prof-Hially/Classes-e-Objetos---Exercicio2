
package classes;
public class Empregado {
    public String nome;
    public String sobrenome;
    public double salario;

    public Empregado(String nome, String sobrenome, double salario){
        this.salario = salario;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double salarioAnual(){
        double totalAnual = salario * 12;
        return totalAnual;
    }
    public double salarioReajustado(){
        double salarioReajustado = ((this.salario * 0.10) + this.salario) * 12;
        return salarioReajustado;
    }
    
    
}
