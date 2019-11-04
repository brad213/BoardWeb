package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class HelloServlet extends HttpServlet{
	public HelloServlet() {
		System.out.println("===>HelloServlet 객체 생성");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletRequest response) throws ServletException,
	IOException{
		System.out.println("doGet() 메소드 호출");
	}

}
