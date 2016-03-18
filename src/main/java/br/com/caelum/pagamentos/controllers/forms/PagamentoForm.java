package br.com.caelum.pagamentos.controllers.forms;

public class PagamentoForm {

	private String bandeira;
	private String numero;
	private String cvv;
	private String emailExistente;
	private NovoClienteForm novoClienteForm = new NovoClienteForm();

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getEmailExistente() {
		return emailExistente;
	}

	public void setEmailExistente(String emailExistente) {
		this.emailExistente = emailExistente;
	}

	public NovoClienteForm getNovoClienteForm() {
		return novoClienteForm;
	}

	public void setNovoClienteForm(NovoClienteForm novoClienteForm) {
		this.novoClienteForm = novoClienteForm;
	}

	@Override
	public String toString() {
		return "PagamentoForm [bandeira=" + bandeira + ", numero=" + numero
				+ ", cvv=" + cvv + ", emailExistente=" + emailExistente
				+ ", novoClienteForm=" + novoClienteForm + "]";
	}

	
}
