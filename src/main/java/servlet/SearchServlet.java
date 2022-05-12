package servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        // 入力値取得
        request.setCharacterEncoding("UTF-8");
        String english = request.getParameter("english");

        //英単語情報の取得
        Dictionary dictionary = new Dictionary();
        HashMap<String, String> dictionaryInfo = dictionary.getDictionaryInfo();

        String result = "";
        String japanese = "";
        /*
         * ※検索ボタンを押したときに必要な処理を実装してください
         */
        
        if (!(english.isEmpty())|| (english.equals("null"))) {
        	//　DictionaryクラスのHashMapから、
        	// 入力値をKeyとして対応するValueがあるか確認する
        	if (dictionaryInfo.containsKey(english)) {
        		
        		//確認用出力
        		System.out.print(english);
        		
        		//英語のキーから日本語を呼び出す。
        		japanese = dictionaryInfo.get(english);
        		
        		//英語と日本語を出力用の形にする。
        		result = "英語：" + english + "、日本語：" + japanese;
        		
        		//requestにセットする。
        		request.setAttribute("result", result);
        		
        	} else {
        		result = "見つかりませんでした";
        		request.setAttribute("result", result);
        	}
        }



        request.getRequestDispatcher("dictionary.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
