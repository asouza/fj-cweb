package br.com.caelum.pagamentos.controllers;

import br.com.caelum.pagamentos.controllers.forms.PagamentoForm;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;

@Resource
public class PagamentosController {

	
	@Get("/pagamentos/novo")
	public void form() {		
	}
	
	@Post("/pagamentos/novo")
	public void novo(PagamentoForm form){
		System.out.println(form.toString());
	}
}
