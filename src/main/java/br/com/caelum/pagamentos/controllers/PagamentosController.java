package br.com.caelum.pagamentos.controllers;

import javax.validation.Valid;

import br.com.caelum.pagamentos.controllers.forms.PagamentoForm;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class PagamentosController {

	private Result result;
	private Validator validator;

	public PagamentosController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
	}

	@Get("/pagamentos/novo")
	public void form() {
	}

	@Post("/pagamentos/novo")
	public void novo(@Valid PagamentoForm form) {
		validator.onErrorForwardTo(this).form();
		
		System.out.println(form.toString());
	}
}
