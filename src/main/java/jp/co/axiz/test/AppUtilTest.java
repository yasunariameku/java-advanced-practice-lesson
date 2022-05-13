package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.until.AppUtil;

class AppUtilTest {
	
	//App appにはどうやって値を入れたらいいのか？何を取って来るのか？
	 //任意に値を入れたらいい。
	
	// isGameApp入力データパターン

	@Test
	public void isGameApp判定1() {
		
		App app = new CardGameApp();
		
        boolean result = AppUtil.isGameApp(app);
        boolean expected = true;
        
        assertEquals(expected, result);
    }
	
	@Test
	public void isGameApp判定2() {
		
		App app = new DartsGameApp();
		
        boolean result = AppUtil.isGameApp(app);
        boolean expected = true;
        
        assertEquals(expected, result);
    }
	
	@Test
	public void isGameApp判定3() {
		
		App app = new ClockApp();
		
        boolean result = AppUtil.isGameApp(app);
        boolean expected = false;
        
        assertEquals(expected, result);
    }
        
	
	
	//isDartsGameApp入力データパターン
	
	@Test
	public void isCardGameApp判定1() {
		
		App app = new CardGameApp();
		
        boolean result = AppUtil.isCardGameApp(app);
        boolean expected = true;
        
        assertEquals(expected, result);
	}
	
	@Test
	public void isCardGameApp判定2() {
		
		App app = new DartsGameApp();
		
        boolean result = AppUtil.isCardGameApp(app);
        boolean expected = false;
        
        assertEquals(expected, result);
	}
	
	
	@Test
	public void isCardGameApp判定3() {
		
		App app = new ClockApp();
		
        boolean result = AppUtil.isCardGameApp(app);
        boolean expected = false;
        
        assertEquals(expected, result);
	}
	
	//isDartsGameApp入力データパターン
	
	@Test
	public void isDartsGameApp判定1() {
		
		App app = new CardGameApp();
		
	    boolean result = AppUtil.isDartsGameApp(app);
	    boolean expected = false;
	    
	    assertEquals(expected, result);
    }
	
	@Test
	public void isDartsGameApp判定2() {
		
		App app = new DartsGameApp();
		
	    boolean result = AppUtil.isDartsGameApp(app);
	    boolean expected = true;
	    
	    assertEquals(expected, result);
    }
	
	@Test
	public void isDartsGameApp判定3() {
		
		App app = new ClockApp();
		
	    boolean result = AppUtil.isDartsGameApp(app);
	    boolean expected = false;
	    
	    assertEquals(expected, result);
    }
	
	// isClockApp入力データパターン
	
	
	@Test
	public void isCloclApp判定1() {
		
		App app = new CardGameApp();
		
        boolean result = AppUtil.isCloclApp(app);
        boolean expected = false;
        
        assertEquals(expected, result);
    }
	
	@Test
	public void isCloclApp判定2() {
		
		App app = new DartsGameApp();
		
        boolean result = AppUtil.isCloclApp(app);
        boolean expected = false;
        
        assertEquals(expected, result);
    }
	
	@Test
	public void isCloclApp判定3() {
		
		App app = new ClockApp();
		
        boolean result = AppUtil.isCloclApp(app);
        boolean expected = true;
        
        assertEquals(expected, result);
    }
        
    
	//getAppName入力データパターン
	
	@Test
	public void getAppName判定1() {
		
		App app = new CardGameApp();
		
        String result = AppUtil.getAppName(app);
        String expected = "ゲーム:カード";
        
        assertEquals(expected, result);
    }
	
	@Test
	public void getAppName判定2() {
		
		App app = new DartsGameApp();
		
        String result = AppUtil.getAppName(app);
        String expected = "ゲーム:ダーツ";
        
        assertEquals(expected, result);
    }
	
	@Test
	public void getAppName判定3() {
		
		App app = new ClockApp();
		
        String result = AppUtil.getAppName(app);
        String expected = "時計";
        
        assertEquals(expected, result);
    }
	
	
}
        
