package aplicacao;
import classes.Empregado;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = sc.nextLine();
        
        System.out.println("Digite o sobrenome");
        String sobrenome = sc.nextLine();
        
        System.out.println("Digite o salario");
        double salario = sc.nextDouble();
        
        Empregado empregado = new Empregado(nome, sobrenome, 1000.0);
        
        System.out.println(empregado.salarioAnual());
        
        System.out.println(empregado.salarioReajustado());
        
        
        
        
        
        
    }
    
}
