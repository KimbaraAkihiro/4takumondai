package quizTayamaKimbaraSisaku;




	import java.util.ArrayList;
import java.util.Collections;
	public class Tayamano {

		public static void main(String[] args) {

			int a = 10;
			int b = 3;

			double c = (double)b/(double)a;
			System.out.print(c);

			int totalTF;


			/*	配列を設定するとき、宣言時に要素数を決める必要がある。
			 * 問題をつぎつぎに追加して、要素数を後から確認する場合には、
			 * 配列ではなくListが便利。
			 * 今回はListを用いたコードを書くことにする。
			 *
			 *
			int totalQu = 10;

			String[] quizz = new String[10];
			int[] ans = new int[totalQu];
			//ansの中身が0だったらTrue　1だったらFalse



			quizz[0] =  "Tayama is hage.";
			ans[0]	 = 1;

			quizz[1] = "Tayama is tensai.";
			ans[1] = 0;

			quizz[2] = "Seima is tensai.";
			ans[2] = 0;

			quizz[3] = "Kinbara is tensai.";
			ans[3] = 0;
			*/

			ArrayList<String> TList = new ArrayList<String>();

			//addメソッドの呼び出しはmainメソッド内でしかできない。
			TList.add("Tayama is tensai.");
			TList.add("Seimam is tensai.");
			TList.add("Kinbara is tensai.");
			TList.add("Seima is baka.");
			TList.add("Kinbara is baka");
			TList.add("Seima was a cheating bastard when he was a high school student.");
			TList.add("Kinbara was a cheating bastard when he was a college student.");

			Collections.shuffle(TList);
			//System.out.println(TList.get(0));


			ArrayList<String> FList = new ArrayList<String>();
			FList.add("Tayama is hage.");
			FList.add("Tayama is baka");
			FList.add("I think This project will faild.");
			FList.add("We cannot Create app.");

			Collections.shuffle(FList);


			totalTF = TList.size() + FList.size();

		}


	}

