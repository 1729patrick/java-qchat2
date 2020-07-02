/**
 * 
 */
package br.edu.unoesc.projetofinal.qchat.server;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe que implementa um objeto Mensagem. Armazena as informações do usuário
 * e uma lista enumerada de ações do objeto.
 * 
 * @author Jordan Alexander
 * @since 22/10/2018
 * @version 2.0
 *
 */

public class QChatMensagem implements Serializable {
	private String nome;
	private String texto;
	private Set<String> setOnlines = new HashSet<String>();
	private Acoes acao;

	public enum Acoes {
		CONECTAR, DESCONECTAR, ENVIAR, USUARIOS_ONLINE;
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
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * @return the setOnlines
	 */
	public Set<String> getSetOnlines() {
		return setOnlines;
	}

	/**
	 * @param setOnlines the setOnlines to set
	 */
	public void setSetOnlines(Set<String> setOnlines) {
		this.setOnlines = setOnlines;
	}

	/**
	 * @return the acao
	 */
	public Acoes getAcao() {
		return acao;
	}

	/**
	 * @param acao the acao to set
	 */
	public void setAcao(Acoes acao) {
		this.acao = acao;
	}

}
