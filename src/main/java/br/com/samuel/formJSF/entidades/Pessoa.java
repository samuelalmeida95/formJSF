package br.com.samuel.formJSF.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString(exclude = "id")
@EqualsAndHashCode(exclude = { "nome", "sobrenome", "idade", "dataNascimento" })
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private String sobrenome;

	@Getter
	@Setter
	private Integer idade;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
}
