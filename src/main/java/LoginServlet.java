

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginA")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		if (id == "") {
			request.setAttribute("id", "IDは必須です");
		}
		
		if (pass == "") {
			request.setAttribute("pass", "PASSは必須です");
		}
		
		if (id == "" || pass == "") {
	        request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
		String result = null;
		
		if((id.equals("axiz") && pass.equals("axizuser"))) {
			request.setAttribute("id", id);
			request.getRequestDispatcher("/result.jsp").forward(request, response);
			
		}else if (id.equals("technocore")&& pass.equals("techno-pass")) {
			request.setAttribute("id", id);
			request.getRequestDispatcher("/result.jsp").forward(request, response);

		}else {
			result = "IDまたはPASSが間違っています";
			request.setAttribute("result", result );
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
		

		
	}

}
