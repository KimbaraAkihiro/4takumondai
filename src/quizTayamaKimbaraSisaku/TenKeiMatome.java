package quizTayamaKimbaraSisaku;

public class TenKeiMatome {

	public static void shogo(double seiritu) {
		if(seiritu==1.00) {
			System.out.println("貴殿は、<<<<<猛者>>>>>になります。");
		}else if(seiritu>0.7) {
			System.out.println("あなたは****常人****です。");
		}else {
			System.out.println("おまえは下人");
		}
	}


	public static void tuyoshogo(double tuyoseiritu){
		if(tuyoseiritu==1.00) {
			System.out.println("貴殿は、<<<性魔>>>です。");
		}else if(tuyoseiritu>1.0) {
			System.out.println("あなたは***隠居***です。");
		}else if(tuyoseiritu>0.90) {
			System.out.println("あなたは、--新卒--です。");
		}else if(tuyoseiritu>0.80) {
			System.out.println("あなたは～神～です。");
		}else if(tuyoseiritu>0.70) {
			System.out.println("あなたは[[ウルトラマン]]です。");
		}else if(tuyoseiritu>0.60) {
			System.out.println("あなたは天才です。");
		}else if(tuyoseiritu>0.50) {
			System.out.println("あなたはバカです。");
		}else if(tuyoseiritu>0.40) {
			System.out.println("あなたは猿です。");
		}else if(tuyoseiritu>0.30) {
			System.out.println("あなたはありです。");
		}else if(tuyoseiritu>0.20) {
			System.out.println("あなたはゴキブリ");
		}else if(tuyoseiritu>0.10) {
			System.out.println("お前はダニ");
		}else if(tuyoseiritu>0.00000000000001) {
			System.out.println("ゴミ");
		}else if(tuyoseiritu==0) {
			System.out.println("せいま");
		}else{
			System.out.println("エラー");
		}


	}
}