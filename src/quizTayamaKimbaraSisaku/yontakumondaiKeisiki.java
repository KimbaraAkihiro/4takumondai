package quizTayamaKimbaraSisaku;

public class yontakumondaiKeisiki {


	public void mondai(String mondai) {
		System.out.println(mondai);
	}
	public  void kaitou(String kaitou) {
		System.out.println(kaitou);
	}
	public  void seikai(int seikai, int tokuten) {
	int kotae = new java.util.Scanner(System.in).nextInt();
	if(kotae == seikai) {
		System.out.println("大正解だ！");
		tokuten++;

	} else {
		System.out.println("残念、ハズレだ");

	}

	}



	public String mazide() {
		// TODO 自動生成されたメソッド・スタブ
		String mondaibun = "問1 明日の天気を答えなさい";
		return mondaibun;
		}


}




