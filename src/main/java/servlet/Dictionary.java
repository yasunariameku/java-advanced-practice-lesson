package servlet;

import java.util.HashMap;

/**
 * 英単語情報を保持するためのクラス
 */
public class Dictionary {

    /**
     * 英単語情報を表すHashMap (Key：英語、Value：日本語)
     */
    private HashMap<String, String> dictionaryInfo;


    public Dictionary() {

    	dictionaryInfo = new HashMap<String, String>();

        /*
         * 下記のコメントを参考に英単語情報を登録してください
         */

    	//todo:英単語情報に追加したい用語をHashMapへ追加
    	//英語をKey、日本語をValueとする
    	//例）dictionaryInfo.put("dog", "犬");
    	//※セットする値はテキストを参照してください
    	dictionaryInfo.put("apple", "りんご");
    	dictionaryInfo.put("orange", "みかん");
    	dictionaryInfo.put("peach", "もも");
    	dictionaryInfo.put("grape", "ぶどう");
    	dictionaryInfo.put("pear", "なし");




    }



    public void setDictionaryInfo(HashMap<String, String> dictionaryInfo) {
        this.dictionaryInfo = dictionaryInfo;
    }

    public HashMap<String, String> getDictionaryInfo() {
        return dictionaryInfo;
    }

}