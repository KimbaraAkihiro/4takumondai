package quizTayamaKimbaraSisaku;

public class TitleAndRule {
	void showTitle() {  //起動時の表示

		try {
		    System.out.println("起動中" + "\n");
		    Thread.sleep(3000);
	        System.out.println("《《《《《《【最強のクイズ】》》》》》》");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		try {
		    System.out.println("\n");
		    Thread.sleep(1000);
	        System.out.println("\n");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
}
	void showEnd() {  //終了時の表示
		try {
		    System.out.println( "\n");
		    Thread.sleep(1000);
	        System.out.println("セーブデータを破棄します");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		try {
		    System.out.println("\n");
		    Thread.sleep(3000);
	        System.out.println("\n");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("【最強のクイズ】を終了しました");
	}

    void teikei() {
	    System.out.println("最後に点数が表示されます。");
     	System.out.println("高得点を目指してください。");
	    System.out.println("では頑張ってください！");
     }

//ルール表示メソッド
    void showYonmon() {
	    System.out.println("四択問題を開始します。");
	    System.out.println("問題文が表示された後、選択肢が表示されます。");
	    System.out.println("選択肢を半角数字で入力してください。");
	    this.teikei();
    }

    void showSeijo() {
      	System.out.println("整序問題を開始します。");
    	System.out.println("数字のついた問題文が表示されます。");
	System.out.println("正しく並び替えて、半角数字で回答してください。");
	this.teikei();
}

    void showKeisan() {
	    System.out.println("計算問題を開始します。");
	    System.out.println("表示された計算問題を演算して、答えを半角数字で入力してください。");
	    this.teikei();
    }

    void showMB() {
	    System.out.println("〇×問題を開始します。");
	    System.out.println("表示された問題文に対して、あっていたら半角英語でt、間違っていたらfを入力してください。");
	    this.teikei();
    }

    void showKijutu() {
	System.out.println("記述問題を開始します。");
	System.out.println("表示された問題文の答えを日本語で入力してください。");
	this.teikei();
    }

}
