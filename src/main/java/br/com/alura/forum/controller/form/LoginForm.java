package br.com.alura.forum.controller.form;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter @Getter
public class LoginForm {

	@NotNull
	@Email
	@NotEmpty
	private String email;

	@NotNull
	@NotEmpty
	private String senha;

	public UsernamePasswordAuthenticationToken converter(){
		return new UsernamePasswordAuthenticationToken(email, senha);
	}

}
