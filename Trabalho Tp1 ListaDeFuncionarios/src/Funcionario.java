import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    private double gratificacao;
    
    
    public Funcionario(int matricula, String nome, double salario, double gratificacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.gratificacao = gratificacao;
        
    }
    
    

public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public double getGratificacao() {
		return gratificacao;
	}



	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	


	
	public String imprimirDadosFuncionario() {
        DecimalFormat decimalFormat = new DecimalFormat("R$ #,##0.00");

        String mensagem = "==============================================\n" 
                + String.format("%03d %s - %s - %s\n", getMatricula(), getNome(),
                        decimalFormat.format(getSalario()), decimalFormat.format(getGratificacao()))
                ;

        	return mensagem; 
        }



	public String getFilhos() {
		// TODO Auto-generated method stub
		return Filho.imprimeFilho();
	}
    
}




