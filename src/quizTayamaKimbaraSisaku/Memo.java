package quizTayamaKimbaraSisaku;

public class Memo {
	public static void main(String[] args) {
		int kai = 5786;
		int[] keta = new int[4];
		keta[3] = kai/1000;
		keta[2] = (kai - keta[3]*1000)/100;
		keta[1] = (kai - keta[3]*1000 - keta[2]*100)/10;
		keta[0] = kai - keta[3]*1000 - keta[2]*100 - keta[1]*10;
int[] rr = {30,40,50};

		System.out.println(rr);
	}
}

