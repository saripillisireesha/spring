package com.example.demo3.spngs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Insertcontro {
@Autowired
Insertserv ps;
@PostMapping("insert2")
public String ins(@RequestBody Setgetins s1){
	int in=ps.insert2(s1);
	if(in>0) {
		return "done";
	}
	else {
		return "unsuccsessful";
	}
	
}
//@GetMapping("table1")
//public List fetch1(@RequestParam String a)
//{
//	return ps.select(a);
//}
//@PostMapping("tale1")
//public List fetch2(@RequestBody Setgetins s)
//{
//	return ps.select3(s);
//}
@GetMapping("sil1")
public List fetch2(@RequestBody Setgetins s)
{
	return ps.select4(s);
}
}
