package com.example.demo3.spngs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Servs {
@Autowired
JdbcTemplate j;
@Autowired
NamedParameterJdbcTemplate np;
public int insert(Students s1) {
	int id=s1.getId();
	String name=s1.getName();
	String email=s1.getEmail();
	String country=s1.getCountry();
	String branch=s1.getBranch();
	String s="insert into student values(?,?,?,?,?)";
	return j.update(s,id,name,email,country,branch);
	
}
public int insert1(Students s1) {
	MapSqlParameterSource spm=new MapSqlParameterSource().addValue("id",s1.getId())
			.addValue("name",s1.getName())
			.addValue("email",s1.getEmail())
			.addValue("country",s1.getCountry())
			.addValue("branch",s1.getBranch());
	String sql="insert into student values(:id,:name,:email,:country,:branch)";
	return np.update(sql, spm);
			
			
}
}
