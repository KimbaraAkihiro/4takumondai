package quizTayamaKimbaraSisaku;

public class KijutuMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ここでは文字を書くクイズを出すぜ！");
		 kijutu ();

	}
	public static void kijutu () {
		int mondaisu = 8; //《《《《《出題する問題数の設定》》》》》
		int tokuten = 0;

		quizTayamaKimbaraSisaku.KijutuMondaishu mmm = new quizTayamaKimbaraSisaku.KijutuMondaishu();//問題集の呼び出し
		quizTayamaKimbaraSisaku.KijutuToi ttt = new quizTayamaKimbaraSisaku.KijutuToi();//問題文の表示型の呼び出し

		int[] ary = new int[12]; //配列を定義　ここで格納問題数を入力
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
			String kotae1 = new java.util.Scanner(System.in).nextLine();
            if(kotae1.equals(mmm.seikai1())) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;
		case 2:
			ttt.toi(mmm.toi2());
			String kotae2 = new java.util.Scanner(System.in).nextLine();
            if(kotae2.equals(mmm.seikai2())) {
            	System.out.println("正解だぜ！");
            	tokuten++;
            }else {
            	System.out.println("残念、ハズレだ");
            }
            break;

	    case 3:
	     	ttt.toi(mmm.toi3());
	    	String kotae3 = new java.util.Scanner(System.in).nextLine();
            if(kotae3.equals(mmm.seikai3())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 4:
	     	ttt.toi(mmm.toi4());
	    	String kotae4 = new java.util.Scanner(System.in).nextLine();
            if(kotae4.equals(mmm.seikai4())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 5:
	     	ttt.toi(mmm.toi5());
	    	String kotae5 = new java.util.Scanner(System.in).nextLine();
            if(kotae5.equals(mmm.seikai5())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 6:
	     	ttt.toi(mmm.toi6());
	    	String kotae6 = new java.util.Scanner(System.in).nextLine();
            if(kotae6.equals(mmm.seikai6())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 7:
	     	ttt.toi(mmm.toi7());
	    	String kotae7 = new java.util.Scanner(System.in).nextLine();
            if(kotae7.equals(mmm.seikai7())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 8:
	     	ttt.toi(mmm.toi8());
	    	String kotae8 = new java.util.Scanner(System.in).nextLine();
            if(kotae8.equals(mmm.seikai8())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 9:
	     	ttt.toi(mmm.toi9());
	    	String kotae9 = new java.util.Scanner(System.in).nextLine();
            if(kotae9.equals(mmm.seikai9())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 10:
	     	ttt.toi(mmm.toi10());
	    	String kotae10 = new java.util.Scanner(System.in).nextLine();
            if(kotae10.equals(mmm.seikai10())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 11:
	     	ttt.toi(mmm.toi11());
	    	String kotae11 = new java.util.Scanner(System.in).nextLine();
            if(kotae11.equals(mmm.seikai11())) {
        	    System.out.println("正解だぜ！");
         	    tokuten++;
            }else {
        	    System.out.println("残念、ハズレだ");
            }
            break;
	    case 12:
	     	ttt.toi(mmm.toi12());
	    	String kotae12 = new java.util.Scanner(System.in).nextLine();
            if(kotae12.equals(mmm.seikai12())) {
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
