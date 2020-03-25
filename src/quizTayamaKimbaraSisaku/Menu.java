package quizTayamaKimbaraSisaku;

import java.io.IOException;

public class Menu {
	public static int menu() throws IOException{

		System.out.println("[メニュー]");
		System.out.println("1:クイズに挑戦！　2:正解率と称号の確認　3:ゲームを終了する");
		int menu = new java.util.Scanner(System.in).nextInt();
		int modoru = 0;
		switch(menu) {
		case 1:     //クイズに挑戦！
		do{ironnamondai();
		    System.out.println("もちろんクイズを続けるだろ？");
		    System.out.println("1:はい　2:いいえ");
		    modoru = new java.util.Scanner(System.in).nextInt();
			} while(modoru == 1);
		    System.out.println("メニュー画面にもどるぜ！");
		    break;

		case 2:
		do{shogo();
		   System.out.println("\n" + "他の正解率と照合も見ますか？");
		   System.out.println("1:はい　2:メニューに戻る");
		   modoru = new java.util.Scanner(System.in).nextInt();
		} while(modoru == 1);
		    break;

		case 3:
			modoru = 3;
			break;
		}
		return modoru;


	}

	public static void ironnamondai() throws IOException{  //クイズに挑戦！
		TitleAndRule hajimari = new TitleAndRule();
		System.out.println("挑戦するクイズを選ぼう");
		System.out.println("1:四択クイズ　2:○×クイズ　3:並べるクイズ　4:計算クイズ　5:書き込みクイズ");
		int erabu = new java.util.Scanner(System.in).nextInt();
		switch(erabu) {
		case 1:
			hajimari.showYonmon(); //ルールの表示
			String[] aaa = {"あらら"};
			YonmonMain aa = new YonmonMain();
			 aa.main(aaa);
			 break;
		case 2:
			hajimari.showMB(); //ルールの表示
			String[] bbb = {"あらら"};
			TFMain bb = new TFMain();
			 bb.main(bbb);
			break;

		case 3:
			SejoMain1.Seijo();
			break;

		case 4:
			hajimari.showKeisan();
			String[] ddd = {"あらら"};
			KeisanMain dd = new KeisanMain();
			dd.main(ddd);
			break;

		case 5:
			hajimari.showKeisan();
			String[] eee = {"あらら"};
			KijutuMain ee = new KijutuMain();
			ee.main(eee);
			break;
		}
		System.out.println("お疲れ様でした！" + "\n" + "今回はこれで終了だ。" + "\n" );
	}

	public static void shogo() {
		System.out.println("どのクイズの正解率と照合を確認しますか？");
		System.out.println("1:四択クイズ　2:○×クイズ　3:並べるクイズ　4:計算クイズ　5:書き込みクイズ　6:全てのクイズの合計　7メニューに戻る");
		int erabu = new java.util.Scanner(System.in).nextInt();
	    switch(erabu) {
	    case 1:
		    TenKei.yonsho();
		    break;
	    case 2:
	    	TenKei.tfsho();
	    	break;
	    case 3:
	    	TenKei.seisho();
	    	break;
	    case 4:
	    	TenKei.keisho();
	    	break;
	    case 5:
	    	TenKei.kijsho();
	    	break;
	    case 6:
	    	TenKei.totalsho();
	    	break;
	    case 7:
	    	break;
	}
	}

}
