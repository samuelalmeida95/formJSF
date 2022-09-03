package br.com.samuel.formJSF;

import javax.persistence.Persistence;

public class TesteJPA {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("formJSF");
	}
}
