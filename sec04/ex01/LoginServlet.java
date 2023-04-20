package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login2")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.print("init 메서드 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("destroy 메서드 호출");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setCharacterEncoding("utf-8");
//	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    HttpSession session = request.getSession();
	    String user_id = request.getParameter("user_id");
	    String user_pw = request.getParameter("user_pw");
	    
	    LoginImpl loginUser = new LoginImpl(user_id,user_pw);
	    if(session.isNew()) {
	    	session.setAttribute("loginUser",loginUser);
	    }
	    out.print("<head>");
	    out.print("<script type='text/javascript'>");
	    out.print("setTimeout('history.go(0);',5000)");
	    out.print("</script>");
	    out.print("</head>");
	    out.print("<html><body>");
	    out.print("아이디는 " + loginUser.user_id+"<br>");
	    out.print("총 접속자수는 "+LoginImpl.total_user+"<br>");
	    out.print("</body></html>");
	}
}
