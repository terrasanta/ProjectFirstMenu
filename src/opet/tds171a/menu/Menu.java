package opet.tds171a.menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import opet.tds171a.pessoa.Pessoa;
import opet.tds171a.util.Leitor;

/**
 * Classe Menu
 * Define a navegação pelas funções de CRUD do sistema de cadastro de pessoas
 * @author israe
 *
 */
public class Menu {
	
	/**
	 * 
	 */
	private ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	
	/**
	 * 
	 */
	private final int OPC_SAIR = 9;
	
	/**
	 * 
	 */
	private final int OPC_CADASTRO = 1;
	
	/**
	 * 
	 */
	private final int OPC_LISTAR = 2;

	
	/**
	 * Método construtor da Classe Menu. Não recebe parâmetros.
	 * Inicializa o menu de ações do cadastro de pessoas.
	 */
	public Menu() {
		int opt = -1;
		do{
			System.out.println("MENU DE NAVEGAÇÂO");
			
			System.out.println("Digite 1 para cadastrar");
			System.out.println("Digite 2 para listar");
			System.out.println("Digite 9 sair");
			opt = Leitor.readInt("Digite a opção desejada: ");
			switch(opt){
				case OPC_CADASTRO:
					cadastrar();
					break;
				case OPC_LISTAR:
					listar();
					break;
				case OPC_SAIR:
					System.out.println("Até mais!");
					break;
				default:
					System.out.println("Menu não localizado. Verifique as opções");
			}
			
		}while(opt != OPC_SAIR);
	}
	
	/**
	 * 
	 */
	public void cadastrar(){
		
		System.out.println("CADASTRO");
		System.out.println("=================================");
		
		String nome = Leitor.readString("Digite o nome da Pessoa: ");
		String sexo = Leitor.readString("Digite o sexo da Pessoa: ");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String nascimento = Leitor.readString("Digite a data de nascimento (dd/mm/aaaa): ");
		
		try {
			this.listaPessoa.add(new Pessoa(nome, sexo, sdf.parse(nascimento)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 */
	public void listar(){
		
		System.out.println("LISTAR");
		System.out.println("=================================");
		
		for (Pessoa pessoa : this.listaPessoa) {
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getSexo());
			System.out.println(pessoa.getDataNascimento());
			System.out.println("==================================");
		}
	}

}
