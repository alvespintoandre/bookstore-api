package com.fmtech.bookstore;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fmtech.bookstore.domain.Categoria;
import com.fmtech.bookstore.domain.Livro;
import com.fmtech.bookstore.repository.CategoriaRepository;
import com.fmtech.bookstore.repository.LivroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria = new Categoria(null, "Tecnologia", "Livros de tecnologia");
		Livro livro = new Livro(null, "Java", "James Goslin", "Livro técnico Java", categoria);
		categoria.getLivros().addAll(Arrays.asList(livro));
		
		this.categoriaRepository.saveAll(Arrays.asList(categoria));
		this.livroRepository.saveAll(Arrays.asList(livro));
	}

}
