package cs.impg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cs.impg.modelo.entidade.InscricaoE;

@Controller
public class WebStrat {

	@GetMapping({"","/","/principal"})
	public String principal(Model modelo) {
		
		modelo.addAttribute("title", "Principal || IMPG");
		
		modelo.addAttribute("cabecalho", "Instituto Médio Politécnico Globo");
		modelo.addAttribute("textoPrincipal", "Nzeru Mbawiri");
		
		modelo.addAttribute("painel", "principal");
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}
	
	@GetMapping({"/sobre-nos"})
	public String sobrenos(Model modelo) {

		modelo.addAttribute("title", "Sobre nos || IMPG");

		modelo.addAttribute("cabecalho", "Quem somos");
		modelo.addAttribute("textoPrincipal", "O Instituto Médio Politécnico Globo - Nzeru Mbawiri, é uma Instituição privada de Ensino Técnico Médio Profissional com sede na cidade da Beira, Av. Krus Gomes S/N e delegação na cidade de Chimoio, no Bairro 1° de Maio.");
		
		modelo.addAttribute("painel", "sobre-nos");
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}
	
	@GetMapping({"/cursos"})
	public String cursos(Model modelo) {

		modelo.addAttribute("title", "Cursos || IMPG");

		modelo.addAttribute("cabecalho", "Nossos cursos");
		modelo.addAttribute("textoPrincipal", "Aproveite os cursos que temos nessa instituicao de ensino");
		
		modelo.addAttribute("painel", "cursos");
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}
	
	@GetMapping({"/secretaria-online"})
	public String sercretariaOnline(Model modelo) {

		modelo.addAttribute("title", "Secretaria Online || IMPG");

		modelo.addAttribute("cabecalho", "Atendimento virtual");
		modelo.addAttribute("textoPrincipal", "");
		
		modelo.addAttribute("painel", "secretariaOnline");
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}
	
	@GetMapping({"/inscricao"})
	public String inscricao(Model modelo) {

		modelo.addAttribute("title", "Inscricao || IMPG");

		modelo.addAttribute("cabecalho", "Faca inscricao");
		modelo.addAttribute("textoPrincipal", "Para fazer parte do nosso sistema da educacao, faca a sua devida inscricao");
		
		modelo.addAttribute("painel", "inscricao");
		modelo.addAttribute("inscricao", new InscricaoE());
		
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}
	
	@GetMapping({"/login"})
	public String login(Model modelo) {

		modelo.addAttribute("title", "Login || IMPG");

		modelo.addAttribute("cabecalho", "Faca login");
		modelo.addAttribute("textoPrincipal", "Nao compartilhe seus dados de login");
		
		modelo.addAttribute("painel", "login");
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}
	
	@GetMapping({"/plataformas"})
	public String plataformas(Model modelo) {

		modelo.addAttribute("title", "Plataforma || IMPG");

		modelo.addAttribute("cabecalho", "Nossas plataformas");
		modelo.addAttribute("textoPrincipal", "Para acessar outros servicos que esta instituicao deixa o seu acesso");
		
		modelo.addAttribute("painel", "plataformas");
		modelo.addAttribute("painelConteudo", null);
		return "index";
	}

	
	@GetMapping({"/curso"})
	public String plataformas( @RequestParam("id") String curso, Model modelo) {
		
		modelo.addAttribute("title", "Curso || IMPG");

		modelo.addAttribute("cabecalho", "Detalhes sobre curso " + curso.toUpperCase());
		if(curso.equals("tmg")){
			modelo.addAttribute("cabecalho", "Tecnico de Medicina Geral");
		}else if(curso.equals("esmi")) {
			modelo.addAttribute("cabecalho", "Enfermagem em Saude Materno Infantil");			
		}else if(curso.equals("eg")) {
			modelo.addAttribute("cabecalho", "Enfermagem geral");			
		}else if(curso.equals("ap")) {
			modelo.addAttribute("cabecalho", "Agro-pecuaria");			
		}else if(curso.equals("g")) {
			modelo.addAttribute("cabecalho", "Gestao");			
		}
		modelo.addAttribute("painelConteudo", curso);
		modelo.addAttribute("painel", null);
		return "index";
	}
}
