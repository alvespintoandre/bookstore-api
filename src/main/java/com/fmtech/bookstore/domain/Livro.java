package com.fmtech.bookstore.domain;

import java.util.Objects;

public class Livro {

	private Integer id;
	private String titulo;
	private String autor;
	private String texto;

	private Categoria categoria;

	public Livro(Integer id, String titulo, String autor, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Livro() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
