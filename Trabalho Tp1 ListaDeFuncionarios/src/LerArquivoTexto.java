// BIBLIOTECA QUE LÊ O ARQUIVO DE TEXTO
import java.io.BufferedReader;
import java.io.FileReader;

// BIBLIOTECA PARA UTILIZAÇÃO DE TRY CATCH E FINALLY
import java.io.IOException;

//BIBLIOTECAS PARA INCLEMENTAÇÃO DE FILA
import java.util.List;
import java.util.ArrayList;

// BIBLIOTECA QUE IMPRIME OS DADOS EM UMA FORMATAÇÃO DE PAGINA
import javax.swing.JOptionPane;



public class LerArquivoTexto {
    public static void main(String[] args) {
       String imprimir = "Lista de Funcionários\n";
       
       // INSTANCIANDO A LISTA DE FUNCIONARIOS, POR ISSO ESTA NO PLURAL
       List<Funcionario> funcionarios = new ArrayList<>();
       
       // INSTANCIANDO A LISTA DE FILHOS PARA CADA FUNCIONARIO
       List<Filho> filhos = new ArrayList<>();;
       
       try {
    	   // ALTERAR DIREOTORIO NO DIA DA APRESENTAR TRABALHO
    	   BufferedReader leitor = new BufferedReader(new FileReader("C:\\Users\\augus\\eclipse-workspace\\Trabalho Tp1 ListaDeFuncionarios\\src\\folhaFuncionario.txt"));
    	   String linha;
    	   
    	   
    	   
    	   //ENQUANTO TIVEREM LINHAS A SER LIDAS ELE CONTINUA NESTE LOOP
    	   while(leitor.ready()) {
    		   // linha vai receber oque o leitor esta lendo por cada linha
    		   linha = leitor.readLine();
    		   
    		   
    		   
    		   String[] campos = linha.split("-");
    		   int numCampos = campos.length;
		   		int numFilhos_linha = (numCampos - 4) / 3 + 1;;
   
    		   
    		   
		   			// PEGA OS DADOS DO FUNCIONARIO
    			   int matricula = Integer.parseInt(campos[0]);
        		   String nome = campos[1];
        		   double salario = Double.parseDouble(campos[2]) / 100.0;      		   //TRANSFORMAR O VALOR PARA O PADRÃO EXIGIDO
        		   double gratificacao = Double.parseDouble(campos[3]) / 100.0;			  //TRANSFORMAR O VALOR PARA O PADRÃO EXIGIDO
        		    
        		   
        		   // INSTANCIA DE DADOS DE CADA FUNCIONARIO
        		   Funcionario funcionario = new Funcionario(matricula, nome, salario, gratificacao);        		   
        		   // ADICIONA UM FUNCIONARIO NA LISTA TODA LINHA LIDA
        		   funcionarios.add(funcionario);
    		   
        		   
        		   List<Filho> filhosFuncionario = new ArrayList<>(); // lista de filhos do funcionario atual
        		   Filho filho;
        		   
    		   
        		   for(int i = 4; i <= numFilhos_linha; i+=3) {
        			   String nomeFilho = campos[i];
        			   String dataNasc = campos[i+1];
        			   String sexo = campos[i+2]; 
        			   
        			   filho = new Filho(nomeFilho, dataNasc, sexo);
        			   filhosFuncionario.add(filho); 
        		   }
    		   
        		
        		   filhos.addAll(filhosFuncionario); // adiciona a lista de filhos do funcionario atual à lista de todas as listas de filhos
    		   
    	   }
    	   leitor.close();
       } catch (IOException e) {
    	   // captura um execeção de erro caso ocorra algo ao tentar encontrar o arquivo
    	   JOptionPane.showMessageDialog(null, e);
       }
       finally{
    	   //finaliza imprimindo oque deve ser impresso
    	   for (Funcionario funcionario : funcionarios) {
    		   imprimir += funcionario.imprimirDadosFuncionario();
    		   
    		   for (Filho filho : filhos) {
        		   imprimir +=  filho.imprimeFilho();
        	   }
    	    }
    	   
    	   JOptionPane.showMessageDialog(null, imprimir);
       }
    }
    
    
}




