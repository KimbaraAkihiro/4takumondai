package quizTayamaKimbaraSisaku;

public class TenKei {
	static int yonS = 0;
	static int yonT = 0;

	static int kijS = 0;
	static int kijT = 0;

	static int keiS = 0;
	static int keiT = 0;

	static int seiS = 0;
	static int seiT = 0;

	static int tfS = 0;
	static int tfT = 0;

	public static void yonsei(int seikaisu, int syutudaisu) {
		double seiritu = (double)seikaisu/syutudaisu;
		TenKeiMatome.shogo(seiritu);
		yonT =+ syutudaisu;
		yonS =+ seikaisu;
	}

	public static void kijsei(int seikaisu,int syutudaisu) {
		double seiritu = (double)seikaisu/syutudaisu;
		TenKeiMatome.shogo(seiritu);
		kijT =+ syutudaisu;
		kijS =+ seikaisu;
	}

	public static void keisei(int seikaisu,int syutudaisu) {
		double seiritu = (double)seikaisu/syutudaisu;
		TenKeiMatome.shogo(seiritu);
		keiT =+ syutudaisu;
		keiS =+ seikaisu;
	}
		public static void seisei(int seikaisu,int syutudaisu) {
		double seiritu = (double)seikaisu/syutudaisu;
		TenKeiMatome.shogo(seiritu);
		seiT =+ syutudaisu;
		seiS =+ seikaisu;
	}
		public static void tfsei(int seikaisu,int syutudaisu) {
		double seiritu = (double)seikaisu/syutudaisu;
		TenKeiMatome.shogo(seiritu);
		tfT =+ syutudaisu;
		tfS =+ seikaisu;
	}

	public static void yonsho() {
		double tuyoseiritu = (double)yonS/yonT;
		System.out.println("四択問題の正解率は"+tuyoseiritu+"です。");
		TenKeiMatome.tuyoshogo(tuyoseiritu);
	}
	public static void kijsho() {
		double tuyoseiritu = (double)kijS/kijT;
		System.out.println("記述問題の正解率は"+tuyoseiritu+"です。");
		TenKeiMatome.tuyoshogo(tuyoseiritu);
	}
	public static void keisho() {
		double tuyoseiritu = (double)keiS/keiT;
		System.out.println("計算問題の正解率は"+tuyoseiritu+"です。");
		TenKeiMatome.tuyoshogo(tuyoseiritu);
	}
	public static void seisho() {
		double tuyoseiritu = (double)seiS/seiT;
		System.out.println("整序問題の正解率は"+tuyoseiritu+"です。");
		TenKeiMatome.tuyoshogo(tuyoseiritu);
	}
	public static void tfsho() {
		double tuyoseiritu = (double)tfS/tfT;
		System.out.println("○×問題の正解率は"+tuyoseiritu+"です。");
		TenKeiMatome.tuyoshogo(tuyoseiritu);
	}
	public static void totalsho() {
		double tuyoseiritu = (double)(yonS+kijS+keiS+seiS+tfS)/(yonT+kijT+keiT+seiT+tfT);
		TenKeiMatome.tuyoshogo(tuyoseiritu);
	}

}
