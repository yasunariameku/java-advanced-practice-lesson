package jp.co.axiz.app;

public class CardGameApp extends GameApp  {
	
	//デフォルトコンストラクタ
	public CardGameApp() {
    }
	
	//引数ありコンストラクタ
	public CardGameApp(String item) {
		setItem(item);
		setPlayTime(5);
		
		//アクセサー
    }
	
	protected String play() {
		return "ババ抜きを行います";
	}
	
	//メソッド
	public String start(String name ) {
	
		String A = name + "さんとトランプでゲームを開始します。" + play() ;
		return A;
			 
	}
}