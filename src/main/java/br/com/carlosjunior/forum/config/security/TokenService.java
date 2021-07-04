package br.com.carlosjunior.forum.config.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.carlosjunior.forum.modelo.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

	@Value("${forum.jwt.expiration}")
	private String expiration;

	@Value("${forum.jwt.secret}")
	private String secret;

	public String gerarToken(Authentication authentic) {
		Usuario logado = (Usuario) authentic.getPrincipal();
		
		Date hoje = new Date();
		Date dtExpiracao = new Date(hoje.getTime() + Long.parseLong(expiration));

		return Jwts.builder().setIssuer("API do Fórum - Carlos")
				.setSubject(logado.getId().toString())
				.setIssuedAt(hoje)
				.setExpiration(dtExpiracao)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}

}
