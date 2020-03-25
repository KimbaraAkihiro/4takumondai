package quizTayamaKimbaraSisaku;

public class KijutuToi {
	public  int sum = 0;
	public  void toi(String t) {
		sum++;
		System.out.println();   //改行用
		System.out.println("問" + sum);
		System.out.println("");
		System.out.println(t);
	}
}
