package jp.co.axiz.app;

public class DartsGameApp extends GameApp  {
	
	//デフォルトコンストラクタ
	public DartsGameApp() {
    }
	
	//引数ありコンストラクタ
	public DartsGameApp(String item) {
		setItem(item);
		setPlayTime(10);
    }
	
	protected  String play() {
		return "10回投げて合計点を競います。";
		
	}
	
	public String start(String name ) {
		String A = name + "さんとダーツでゲームを開始します" + play();
		 return A;
	}
	
	
}