package app;

public class CardGameApp extends GameApp  {
	
	//デフォルトコンストラクタ
	public CardGameApp() {
    }
	
	//引数ありコンストラクタ
	public CardGameApp(String item) {
		this.item = item;
    }
	
	public String play() {
		return "ババ抜きを行います";
	}
	
	//メソッド
	public String start(String name ) {
	
		String A = name + "さんとトランプでゲームを開始します。";
		return A;
			 
	}
}