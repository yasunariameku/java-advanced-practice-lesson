package jp.co.axiz.app;

public abstract class  GameApp implements App {
		//フィールド名
		private String item;
		private int playTime;
		
		//デフォルトコンストラクタ
		public GameApp() {
	    }

		//コンストラクタ
		public GameApp( String item) {
			this.item = item;
	    }
		
		//itemのアクセサ
		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}
		
		//playTimeのアクセサ
		public int getPlayTime() {
			return playTime;
		}

		public void setPlayTime(int playTime) {
			this.playTime = playTime;
		}
		
		//抽象化メソッド
		protected abstract String play();
		
		//メソッド
		public String start(String name ) {
			String A = name + "さんと" + this.item + "でゲームを開始します";
			 return A;
		}
}
