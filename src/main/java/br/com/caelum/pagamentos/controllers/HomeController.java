package br.com.caelum.pagamentos.controllers;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class HomeController {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Result result;

	public HomeController(Result result) {
		super();
		this.result = result;
	}

	@Path("/")
	public void index() {
		result.include("msg", "Message from your controller");
	}
}