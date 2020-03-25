package quizTayamaKimbaraSisaku;

import java.io.IOException;

public class SejoMain1 {
	public static void Seijo() throws IOException{
		System.out.println("ここでは並び変えのクイズを出すぜ！");
		SeijoYTM.syutuRan();
		System.out.println("\n" + "終了だ！今回の並び変えクイズの正解数は5問中" + SeijoYTM.tokuten + "問だったぜ");

	}

}
