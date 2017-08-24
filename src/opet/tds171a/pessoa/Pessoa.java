package opet.tds171a.pessoa;

import java.util.Date;

/**
 * Classe Pessoa que representará uma pessoa no mundo real
 * @author Israel Block
 * @version 1.0.0
 * @since 21 de Agosto de 2017
 *
 */
public class Pessoa {

	/**
	 * 
	 */
	private String nome;
	
	/**
	 * 
	 */
	private String sexo;
	
	/**
	 * 
	 */
	private Date dataNascimento;
	
	/**
	 * 
	 */
	public Pessoa() {
	}
	
	/**
	 * 
	 * @param nome
	 * @param sexo
	 * @param dataNascimento
	 */
	public Pessoa(String nome, String sexo, Date dataNascimento){
		setNome(nome);
		setSexo(sexo);
		setDataNascimento(dataNascimento);
	}
	
	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome){
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNome(){
		return this.nome;
	}
	
	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSexo(){
		return this.sexo;
	}
	
	/**
	 * 
	 * @param dataNascimento
	 */
	public void setDataNascimento(Date dataNascimento){
		this.dataNascimento = dataNascimento;
	}
	
	/**
	 * 
	 * @return
	 */
	public Date getDataNascimento(){
		return this.dataNascimento;
	}

}
