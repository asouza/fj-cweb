package br.com.caelum.pagamentos.controllers.forms;

import org.hibernate.validator.constraints.Email;

public class NovoClienteForm {
	
	private String nome;
	@Email
	private String email;

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

	@Override
	public String toString() {
		return "NovoClienteForm [nome=" + nome + ", email=" + email + "]";
	}

}
