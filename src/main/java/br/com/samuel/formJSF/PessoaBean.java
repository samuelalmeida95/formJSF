package br.com.samuel.formJSF;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.samuel.formJSF.dao.DaoGeneric;
import br.com.samuel.formJSF.entidades.Pessoa;

@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();

	private DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();

	public String salvar() {
		daoGeneric.salvar(pessoa);
		pessoa = new Pessoa();
		return "";
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public DaoGeneric<Pessoa> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Pessoa> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
}
