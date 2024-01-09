package com.example.demo3.spngs;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conts {
@Autowired
Servs so;
@PostMapping("insert")
public String insert3(@RequestBody Students s1) {
	int i=so.insert(s1);
	if(i>0) {
		return "Inserted succsessfully";
	}
	else {
		return "Can't insert";
	}
}
@PostMapping("insert12")
public Map  insert(@RequestBody Students s2) {
	int j=so.insert1(s2);
	HashMap<String,String> a=new HashMap<String,String>();
	if(j>0) {
		a.put("success","data inserted");
	}
	else {
		a.put("Failure","not inserted");
	}
	return a;
}
}
