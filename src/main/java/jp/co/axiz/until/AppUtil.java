package jp.co.axiz.until;

import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

public class AppUtil {
	
	
	public static boolean isGameApp(Object app) {
		
		//GameAppか、GameAppを継承したクラス(CardGameApp、DartsGameApp)ならtrueを返却する。
		if (app instanceof GameApp || app instanceof CardGameApp ||  app instanceof DartsGameApp) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isCardGameApp(Object app) {
		
		//引数で受け取ったオブジェクトの型がCardGameAppならtrueを返却する。
		if (app instanceof CardGameApp) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isDartsGameApp(Object app) {
		
		/*引数で受け取ったオブジェクトの型がDartsGameAppならtrueを返却する。 */
		if (app instanceof DartsGameApp) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isCloclApp (Object app) {
		
		//引数で受け取ったオブジェクトの型がClockAppならtrueを返却する。
		if (app instanceof ClockApp) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String getAppName(Object app) {
        String appName = "";

        if (isGameApp(app)) {
            appName = "ゲーム:";
            if (isCardGameApp(app)) {
                appName += "カード";
            } else if (isDartsGameApp(app)) {
                appName += "ダーツ";
            }
        } else if (isCloclApp(app)) {
            appName = "時計";
        }

        return appName;
    }
}

