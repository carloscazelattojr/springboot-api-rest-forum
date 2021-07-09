package br.com.carlosjunior.forum.repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.util.Assert;

import br.com.carlosjunior.forum.modelo.Curso;

@DataJpaTest
public class CursoRepositoryTest {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Test
	public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
		String nomeCurso = "HTM 5";
		Curso curso = cursoRepository.findByNome(nomeCurso);
		Assert
	}

}
