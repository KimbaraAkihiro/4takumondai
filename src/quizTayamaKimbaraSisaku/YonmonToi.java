package quizTayamaKimbaraSisaku;
//問題文を表示するクラス
public class YonmonToi {
	public static int sum = 0;
	public  void toi(String t) {
		sum++;
		System.out.println();   //改行用
		System.out.println("問" + sum + "\n");
		System.out.println(t);
int rrr =1;

	}


    public static int sum2 = 0;
	public int choice (String[] c, int tokuten) {

		// 配列を定義
				int[] ary2 = new int[ 4 ];

				// 配列に1からの連番を格納
				for ( int i = 0; i < ary2.length; ++ i ) ary2[ i ] = i + 1;

				// シャフル
				for ( int i = 0; i < ary2.length; ++ i ) {
					// 0～(配列aryの個数-1)の乱数を発生
					int rnd = (int)( Math.random() * (double)ary2.length );

					// ary[ i ]とary[ rnd ]を入れ替える
					int w = ary2[ i ];
					ary2[ i ] = ary2[ rnd ];
					ary2[ rnd ] = w;
				}

				// 結果を表示
				for ( int i = 0; i < ary2.length; ++ i ) {
					switch(ary2[i]) {

					case 1:
						sum2++;
						if(sum2 == 5) {
							sum2 = 1;
						}                                              //１～４の選択肢の番号をつける

						System.out.print(sum2 + ":" + c[0] + "　");
						break;
					case 2:
						sum2++;
						if(sum2 == 5) {
							sum2 = 1;
						}
						System.out.print(sum2 + ":" + c[1] + "　");
						break;
					case 3:
						sum2++;
						if(sum2 == 5) {
							sum2 = 1;
						}
						System.out.print(sum2 + ":" + c[2] + "　");
						break;
					case 4:
						sum2++;
						if(sum2 == 5) {
							sum2 = 1;
						}
						System.out.print(sum2 + ":" + c[3] + "　");
						break;
					}


				}
				int kaitou = new java.util.Scanner(System.in).nextInt();
				 if(ary2[kaitou-1]== 1){
					  System.out.println("正解！");
					  tokuten++;
					 }else if(ary2[kaitou-1]!=0 || kaitou==1 || kaitou==2 || kaitou==3 || kaitou==4){
					  System.out.println("ハズレだよ！");
					 }else{
					  System.out.println("正しく入力しなさいよ");
                     }
				 return tokuten;
	}
}


