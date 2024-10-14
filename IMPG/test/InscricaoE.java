package cs.impg.modelo.entidade;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class InscricaoE {

	@Id
	private Long id;
	
	@NotBlank(message = "Nome nao pode ser branco")
	private String nome;

	@NotBlank(message = "Apelido nao pode ser branco")
	private String apelido;
	
	@NotBlank(message = "Selecione genero")
	@Size(min = 1, max = 1, message = "O gênero deve ser apenas um caractere")
	private String genero;


	@NotBlank(message = "Morada nao pode ser branco")
	private String morada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	
}
