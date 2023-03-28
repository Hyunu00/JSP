package sec01.ex01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarjavaxta.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.print("init 메서드 호출"); // 시작할때 한번 호출
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print("doGet 메서드 호출"); //호출 될때 마다 사용
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("destroy 메서드 호출");
	}
}
