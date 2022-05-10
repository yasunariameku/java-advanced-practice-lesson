package StartAppServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;
import app.GameApp;
import app.Utility;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StartAppServlet() {
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
		
		//request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
        response.getWriter().append("Served at: ").append(request.getContextPath());
       

	    String name = request.getParameter("name");
	    String item = request.getParameter("item");
	    //System.out.println(name);

	    String result = "未実施";
	    
	    if (!(Utility.isNullOrEmpty(name))) {
	        // このif分の中に、GameAppクラスを使った下記処理を記載してください。
	        // ・GameAppクラスのオブジェクトを作成し、itemフィールドに "何か" という文字列をセット
	        // ・GameAppオブジェクトのstartメソッドを呼び、戻り値を変数resultへ代入する
	        //   startメソッドの引数には、ユーザ名テキストボックスの入力を渡す
	    	
	    	//
	    	GameApp p =  new CardGameApp(item);
	    	
	    	if (("トランプ").equals(item)) {
	    		p.item =  item;
	    	}else {
	    		p.item =  ("何か");
	    	}
	        
	        result = p.start(name);
	        
	        request.setAttribute("result", result);
	        
	    }
        request.getRequestDispatcher("/appStart.jsp").forward(request, response);

	}

}
