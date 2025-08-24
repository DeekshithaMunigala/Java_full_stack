package com.wipro.usermngmt.service.impl;

import java.util.List;
import java.util.Optional;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.wipro.usermngmt.dto.Token;
import com.wipro.usermngmt.entity.User;
import com.wipro.usermngmt.repo.UserRepo;
import com.wipro.usermngmt.service.UserService;
import com.wipro.usermngmt.util.AppConstant;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		Optional<User> userOpt= userRepo.findById(id);
		if(userOpt.isPresent())
		{
			return userOpt.get();
		}
		return null;
	}

	@Override
	public void save(User user) {
		userRepo.save(user);
	}

	@Override
	public void deleteById(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public Token login(User user) {
	    User userData = userRepo.findByEmailAndPassWord(user.getEmail(), user.getPassWord());
	    if (userData != null) {
	        String jwtToken = "Bearer " + getJWTToken(user.getEmail());
	        Token token = new Token();
	        token.setToken(jwtToken);
	        return token;
	    } else {
	        throw new RuntimeException("Invalid email or password");
	    }
	}
	
	

	 private String getJWTToken(String username) {
	        Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(AppConstant.SECRET));
		 	List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

	        return Jwts.builder()
	                .setId("jwtExample")
	                .setSubject(username)
	                .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + 600000))
	                .signWith(key)
	                .compact();
	    }

}
