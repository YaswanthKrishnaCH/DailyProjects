package com.Day2.demo3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientFacingEndPoint {

	@Autowired
	private DBSettings db;
	@Value("${my.greeting}")
	private String message;
	
	@Value("${mylist.values}")
	private List<String> list;
	
	@Value("static messagee.....")
	private String staticmsg;
	
	@RequestMapping(method=RequestMethod.GET,value="hello1")
	public String hello() {
		return "WIthin Hello() Client Facing Controller. "+ message+" List Values:"+list.get(0)+" msg:"+staticmsg+" COnnection"+db.getConnection()+" HOST"+db.getHost()+db.getPort();
		
	}
}
