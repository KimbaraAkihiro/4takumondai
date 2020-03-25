package quizTayamaKimbaraSisaku;

public class YonmonMain {

	public static void main(String[] args) {
		System.out.println("ここでは四択のクイズを出すぜ");
		kaku();

	}
	public static int kaku() {
		int mondaisu = 10;  //出したい問題数を＜の右に入力
		int tokuten = 0;

		quizTayamaKimbaraSisaku.YonmonMondaishu qqq = new quizTayamaKimbaraSisaku.YonmonMondaishu();//問題集の呼び出し
		quizTayamaKimbaraSisaku.YonmonToi mondai = new quizTayamaKimbaraSisaku.YonmonToi();//問題文の表示型の呼び出し

		int[] ary = new int[10]; //配列を定義　ここで格納問題数を入力
		for(int i =0; i < ary.length; i++)ary[i] = i + 1; //配列に１からの連番を格納
		for(int i = 0; i < ary.length; i++) {
			int rnd = (int)( Math.random() * (double)ary.length );

			// ary[ i ]とary[ rnd ]を入れ替える
			int w = ary[ i ];
			ary[ i ] = ary[ rnd ];
			ary[ rnd ] = w;
		}

		// 結果を表示

		for ( int i = 0; i < mondaisu; ++ i )

		switch(ary[ i ]) {

		case 1:
			mondai.toi(qqq.toi1());  //問題文の表示
			tokuten = mondai.choice(qqq.choice1(), tokuten); //選択肢の表示
			break;

		case 2:
			mondai.toi(qqq.toi2());
			tokuten = mondai.choice(qqq.choice2(), tokuten);
			break;
		case 3:
			mondai.toi(qqq.toi3());
			tokuten = mondai.choice(qqq.choice3(), tokuten);
			break;
		case 4:
			mondai.toi(qqq.toi4());  //問題文の表示
			tokuten = mondai.choice(qqq.choice4(), tokuten); //選択肢の表示
			break;

		case 5:
			mondai.toi(qqq.toi5());
			tokuten = mondai.choice(qqq.choice5(), tokuten);
			break;
		case 6:
			mondai.toi(qqq.toi6());
			tokuten = mondai.choice(qqq.choice6(), tokuten);
			break;
		case 7:
			mondai.toi(qqq.toi7());  //問題文の表示
			tokuten = mondai.choice(qqq.choice7(), tokuten); //選択肢の表示
			break;

		case 8:
			mondai.toi(qqq.toi8());
			tokuten = mondai.choice(qqq.choice8(), tokuten);
			break;
		case 9:
			mondai.toi(qqq.toi9());
			tokuten = mondai.choice(qqq.choice9(), tokuten);
			break;
	    case 10:
		    mondai.toi(qqq.toi10());
		    tokuten = mondai.choice(qqq.choice10(), tokuten);
		    break;
	}
		System.out.println("今回の四宅クイズの正解数は" + mondaisu + "問中" + tokuten + "問だったぜ");
		TenKei.yonsei(tokuten, mondaisu);
		return tokuten;
	}
}
