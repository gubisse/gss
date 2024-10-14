package cs.impg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginPost {

	@PostMapping("login")
	public String login(Model modelo) {

		modelo.addAttribute("title", "Login || IMPG");

		modelo.addAttribute("cabecalho", "Login simulado");
		modelo.addAttribute("textoPrincipal", "");
		
		modelo.addAttribute("painel", "login");
		modelo.addAttribute("painelConteudo", null);
		
		return "index";
	}
}
