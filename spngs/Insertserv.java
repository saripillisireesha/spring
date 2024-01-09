package com.example.demo3.spngs;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;

@Service
public class Insertserv {
	@Autowired
JdbcTemplate ps;
public int insert2(Setgetins s1) {
String f=s1.getFname();
String l=s1.getLname();
String  em=s1.getEmail();
String un=s1.getUsername();
String d=s1.getDob();
String p=s1.getPwd();
String m=s1.getMobile();
int g=s1.getPincode();


String uname=""+f.charAt(0)+f.charAt(1);
String gm=""+l+d.charAt(0)+d.charAt(1)+"@gmail.com";
String s="insert into Table1(fname,lname,emial,uname,pwd,dob,mobile,pincode) values(?,?,?,?,?,?,?,?)";
int res=ps.update(s,f,l,gm,uname,p,d,m,g);
//String s11="update Table1 set fname=?,mobile=? where lname=?";
//int res=ps.update(s11,f,m,l);
//String s12="delete from Table1 where fname=?";
//int res=ps.update(s12,f);
return res;
}

//}
//public List select(String a)
//{
//String querry="select * from Table1 where fname=?";
//List getData=new ArrayList();
//List <Map<String,Object>> tabledata =new ArrayList<Map<String,Object>>();
//tabledata=ps.queryForList(querry,a); 
//Map mapdata;
//
//for(Map fetchdata:tabledata) {
//	mapdata=new HashMap<String,Object>();SELECT * FROM sireesha.Table1;
//	mapdata.put("fname",fetchdata.get("fname"));
//	mapdata.put("lname",fetchdata.get("lname"));
//	mapdata.put("email",fetchdata.get("email"));
//	mapdata.put("uname",fetchdata.get("uname"));
//	mapdata.put("pwd",fetchdata.get("pwd"));
//	mapdata.put("dob",fetchdata.get("dob"));
//	mapdata.put("mobile",fetchdata.get("mobile"));
//	mapdata.put("pincode",fetchdata.get("pincode"));
//	getData.add(mapdata);
//	
//}
//return getData;
//
//	
//}}
//public List select3(Setgetins s) 
//{
//	String  mail=s.getEmail();
//	String username=s.getUsername();
//	int phno=s.getMobile();
//
//String querry="select * from Table1 where emial like '"+mail+"%' or uname like  '"+username+"%' or mobile like '"+phno+"%'";
//List getData=new ArrayList();
//List <Map<String,Object>> tabledata =new ArrayList<Map<String,Object>>();
//tabledata=ps.queryForList(querry); 
//Map mapdata;
//
//for(Map fetchdata:tabledata) {
//	mapdata=new HashMap<String,Object>();
//	mapdata.put("fname",fetchdata.get("fname"));
//	mapdata.put("lname",fetchdata.get("lname"));
//	mapdata.put("email",fetchdata.get("emial"));
//	mapdata.put("uname",fetchdata.get("uname"));
//	mapdata.put("pwd",fetchdata.get("pwd"));
//	mapdata.put("dob",fetchdata.get("dob"));
//	mapdata.put("mobile",fetchdata.get("mobile"));
//	mapdata.put("pincode",fetchdata.get("pincode"));
//	getData.add(mapdata);
//	
//}
//return getData;
//
//	
//}}
public List select4(Setgetins s) 
{
	String  mail=s.getEmail();
	String username=s.getUsername();
	String phno=s.getMobile();
	String querry="";
	if(mail==null && username==null && phno==null) {
	 querry="select * from Table1";
	}
	else if((mail!=null && username!=null)) {
		querry="select * from Table1 where emial like '"+mail+"%' or uname like '"+username+"%'";
	}
	else if((mail!=null && phno!=null)) {
		 querry="select * from Table1 where emial like '"+mail+"%' or mobile like '"+phno+"%'";

	}
	else if((username!=null && phno!=null)){
		 querry="select * from Table1 where uname like '"+username+"%' or mobile like '"+phno+"%'";

	}
	else {
 querry="select * from Table1 where emial like '"+mail+"%' or uname like  '"+username+"%' or mobile like '"+phno+"%'";
	}
	List getData=new ArrayList();
List <Map<String,Object>> tabledata =new ArrayList<Map<String,Object>>();
tabledata=ps.queryForList(querry); 

return tabledata;

	
}}

