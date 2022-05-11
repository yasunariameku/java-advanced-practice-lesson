package app;

/**
 * アプリクラスに共通するメソッドを定義するためのインターフェース
 */
public interface App {
    /**
     * アプリを開始するメソッド (抽象メソッド)
     */
    String start(String userName);
}
