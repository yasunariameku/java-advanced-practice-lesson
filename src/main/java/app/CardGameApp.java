package app;

public class CardGameApp extends GameApp {
	
	//デフォルトコンストラクタ
	public CardGameApp() {
    }
	
	//引数ありコンストラクタ
	public CardGameApp( String item) {
		this.item = item;
    }
	
	//メソッド
	public String start(String name ) {
		
		if(this.item.equals("トランプ")) {
			String A = name + "さんとトランプでゲームを開始します。ババ抜きを行います";
			 return A;
			
		}else {
			String A = name + "さんと" + this.item + "でゲームを開始します";
			 return A;
		}
		
		
	}
}