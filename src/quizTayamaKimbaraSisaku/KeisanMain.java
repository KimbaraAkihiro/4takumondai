package quizTayamaKimbaraSisaku;

public class KeisanMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ここでは数字のクイズをだすぜ");
		kazoeru();
	}


	public static void kazoeru() {
		int mondaisu = 8; //《《《《《出題問題数の設定》》》》》
		int tokuten = 0;
		quizTayamaKimbaraSisaku.KeisanToi ttt = new quizTayamaKimbaraSisaku.KeisanToi();
		quizTayamaKimbaraSisaku.KeisanMondaishu mmm  = new quizTayamaKimbaraSisaku.KeisanMondaishu();
		int[] ary = new int[13]; //配列を定義　ここに格納問題数を入力
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
			ttt.toi(mmm.toi1());
			int kotae1 = new java.util.Scanner(System.in).nextInt();
            if(kotae1 == mmm.seikai1()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 2:
			ttt.toi(mmm.toi2());
			int kotae2 = new java.util.Scanner(System.in).nextInt();
            if(kotae2 == mmm.seikai2()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 3:
			ttt.toi(mmm.toi3());
			int kotae3 = new java.util.Scanner(System.in).nextInt();
            if(kotae3 == mmm.seikai3()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 4:
			ttt.toi(mmm.toi4());
			int kotae4 = new java.util.Scanner(System.in).nextInt();
            if(kotae4 == mmm.seikai4()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 5:
			ttt.toi(mmm.toi5());
			int kotae5 = new java.util.Scanner(System.in).nextInt();
            if(kotae5 == mmm.seikai5()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 6:
			ttt.toi(mmm.toi6());
			int kotae6 = new java.util.Scanner(System.in).nextInt();
            if(kotae6 == mmm.seikai6()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 7:
			ttt.toi(mmm.toi7());
			int kotae7 = new java.util.Scanner(System.in).nextInt();
            if(kotae7 == mmm.seikai7()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 8:
			ttt.toi(mmm.toi8());
			int kotae8 = new java.util.Scanner(System.in).nextInt();
            if(kotae8 == mmm.seikai8()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 9:
			ttt.toi(mmm.toi9());
			int kotae9 = new java.util.Scanner(System.in).nextInt();
            if(kotae9 == mmm.seikai9()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 10:
			ttt.toi(mmm.toi10());
			int kotae10 = new java.util.Scanner(System.in).nextInt();
            if(kotae10 == mmm.seikai10()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 11:
			ttt.toi(mmm.toi11());
			int kotae11 = new java.util.Scanner(System.in).nextInt();
            if(kotae11 == mmm.seikai11()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 12:
			ttt.toi(mmm.toi12());
			int kotae12 = new java.util.Scanner(System.in).nextInt();
            if(kotae12 == mmm.seikai12()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 13:
			ttt.toi(mmm.toi13());
			int kotae13 = new java.util.Scanner(System.in).nextInt();
            if(kotae13 == mmm.seikai13()) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
	}
		System.out.println("\n" + "終了だ！今回の数字クイズの正解数は" +  mondaisu + "問中" + tokuten + "問だったぜ");
		TenKei.yonsei(tokuten, mondaisu); //称号の表示
	}
}
