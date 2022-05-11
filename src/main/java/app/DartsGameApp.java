package app;

public class DartsGameApp extends GameApp  {
	
	//デフォルトコンストラクタ
	public DartsGameApp() {
    }
	
	//引数ありコンストラクタ
	public DartsGameApp(String item) {
		this.item = item;
    }
	
	public String play() {
		return "10回投げて合計点を競います。";
		
	}
	
	
}