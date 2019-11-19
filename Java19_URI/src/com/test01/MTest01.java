package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {

	public static void main(String[] args) throws URISyntaxException {
		
		URI u = new URI("http://localhost:8787/Java19_URI_Web/res.jsp?myname=%EB%9A%B1%EC%95%84&myaddr=%EB%8C%80%ED%95%9C%EB%AF%BC%EA%B5%AD");
		
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());
	}
}
