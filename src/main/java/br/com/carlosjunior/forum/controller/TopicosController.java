package br.com.carlosjunior.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosjunior.forum.dto.TopicoDto;
import br.com.carlosjunior.forum.modelo.Curso;
import br.com.carlosjunior.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> listar() {
		Topico topico = new Topico("Dúvidas", "Dúvida com Spring", new Curso("SpringBoot", "Programação"));
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}

}
