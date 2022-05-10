package app;

public class GameApp {
	//フィールド名
		public String item;
		
		//デフォルトコンストラクタ
		public GameApp() {
	    }
		
		//コンストラクタ
		public GameApp( String item) {
			this.item = item;
	    }
		
		//メソッド
		public String start(String name ) {
			String A = name + "さんと" + this.item + "でゲームを開始します";
			 return A;
		}
}
