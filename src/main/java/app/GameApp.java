package app;

public abstract class  GameApp implements App {
		//フィールド名
		public String item;
		
		//デフォルトコンストラクタ
		public GameApp() {
	    }
		
		//コンストラクタ
		public GameApp( String item) {
			this.item = item;
	    }
		
		//抽象化メソッド
		public abstract String play();
		
		//メソッド
		public String start(String name ) {
			String A = name + "さんと" + this.item + "でゲームを開始します";
			 return A;
		}
}
