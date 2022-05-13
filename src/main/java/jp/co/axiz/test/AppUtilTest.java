package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.until.AppUtil;

class AppUtilTest {
	
	App app = new DartsGameApp();
	//App appにはどうやって値を入れたらいいのか？何を取って来るのか？
	 //任意に値を入れたらいい。

	@Test
	public void isGameApp判定() {
        boolean result = AppUtil.isGameApp(app);
        boolean expected = false;
        
        if (app instanceof CardGameApp) {
        	
        	//appがCardGameAppだった時
        	expected = true; // 想定される結果
        	
        }else if (app instanceof DartsGameApp) {
        	
        	//appがDartsGameAppだった時
        	expected = true; // 想定される結果
        	
        }else {
        	
        	//appがClockAppだった時
        	expected = false; // 想定される結果
        }
        

        // 想定される結果と処理結果とを比較
        assertEquals(expected, result);
    }
	
	@Test
	public void isCardGameApp判定() {
        boolean result = AppUtil.isCardGameApp(app);
        boolean expected = false;
        
        if (app instanceof CardGameApp) {
        	
        	//appがCardGameAppだった時
        	expected = true; // 想定される結果
        	
        }else if (app instanceof DartsGameApp) {
        	
        	//appがDartsGameAppだった時
        	expected = false; // 想定される結果
        	
        }else {
        	
        	//appがClockAppだった時
        	expected = false; // 想定される結果
        }
        

        // 想定される結果と処理結果とを比較
        assertEquals(expected, result);
    }
	
	@Test
	public void isDartsGameApp判定() {
        boolean result = AppUtil.isDartsGameApp(app);
        boolean expected = false;
        
        if (app instanceof CardGameApp) {
        	
        	//appがCardGameAppだった時
        	expected = false; // 想定される結果
        	
        }else if (app instanceof DartsGameApp) {
        	
        	//appがDartsGameAppだった時
        	expected = true; // 想定される結果
        	
        }else {
        	
        	//appがClockAppだった時
        	expected = false; // 想定される結果
        }
        

        // 想定される結果と処理結果とを比較
        assertEquals(expected, result);
    }
	
	public void isCloclApp判定() {
        boolean result = AppUtil.isCloclApp(app);
        boolean expected = false;
        
        if (app instanceof CardGameApp) {
        	
        	//appがCardGameAppだった時
        	expected = false; // 想定される結果
        	
        }else if (app instanceof DartsGameApp) {
        	
        	//appがDartsGameAppだった時
        	expected = false; // 想定される結果
        	
        }else {
        	
        	//appがClockAppだった時
        	expected = true; // 想定される結果
        }
        

        // 想定される結果と処理結果とを比較
        assertEquals(expected, result);
    }
	
	
	public void getAppName判定() {
        String result = AppUtil.getAppName(app);
        String expected = "";
        
        if (app instanceof CardGameApp) {
        	
        	//appがCardGameAppだった時
        	expected = "ゲーム:カード"; // 想定される結果
        	
        }else if (app instanceof DartsGameApp) {
        	
        	//appがDartsGameAppだった時
        	expected = "ゲーム:ダーツ"; // 想定される結果
        	
        }else {
        	
        	//appがClockAppだった時
        	expected = "時計"; // 想定される結果
        }
        

        // 想定される結果と処理結果とを比較
        assertEquals(expected, result);
    }
}
