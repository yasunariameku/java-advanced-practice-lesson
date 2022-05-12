package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.Utility;

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
	    	
	    	if (("時計").equals(item)) {
	    		
	    		ClockApp c = new ClockApp();
	    		
	    		result = c.start(name);
	    		
	    	} else if (("トランプ").equals(item)) {
	    		CardGameApp p =  new CardGameApp(item);
	    		//p.item =  item;
	    		
	    		result = p.start(name);
	    		request.setAttribute("playTime", p.getPlayTime());
	    
	    		
	    	}else if (("ダーツ").equals(item)) {
	    		DartsGameApp p =  new DartsGameApp(item);
	    		//p.item =  item;
	    
	    		result = p.start(name);
	    		request.setAttribute("playTime", p.getPlayTime());
	    	
	    	}else {
	    		result = "アプリの実行に失敗しました。";
	    	}
	        
	        request.setAttribute("result", result);
	        
	    }
        request.getRequestDispatcher("/appStart.jsp").forward(request, response);

	}

}
