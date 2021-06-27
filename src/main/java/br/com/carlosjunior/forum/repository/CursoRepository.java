package br.com.carlosjunior.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
