package br.com.repository;

import br.com.samuel.formJSF.entidades.Pessoa;

public interface IDaoPessoa {
	Pessoa consultarUsuario(String login, String senha);
}
