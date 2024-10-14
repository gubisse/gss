package cs.impg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cs.impg.modelo.entidade.InscricaoE;
import jakarta.validation.Valid;

@Controller
public class InscricaoPost {

	@PostMapping("inscrever")
	public String inscrever(@Valid @ModelAttribute("inscricao") InscricaoE inscricao, BindingResult result, Model modelo) {

		modelo.addAttribute("title", "Inscricao || IMPG");

		modelo.addAttribute("cabecalho", "Simulacao de inscricao");
		modelo.addAttribute("textoPrincipal", "");
		
		modelo.addAttribute("painel", "inscricao");
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}
}
