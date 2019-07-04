package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class TopicoForm {

	@NotNull
	@NotEmpty
	@Length(min = 5, max = 32)
	private String titulo;
	@NotNull
	@NotEmpty
	@Length(min = 10)
	private String mensagem;
	@NotNull
	@NotEmpty
	private String nomeCurso;

	public Topico converter(CursoRepository cursoRepository) {
		return Topico.builder().titulo(titulo).mensagem(mensagem).curso(cursoRepository.findByNome(nomeCurso)).build();
	}
}
