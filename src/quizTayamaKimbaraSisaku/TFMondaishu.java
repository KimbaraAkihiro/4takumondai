package quizTayamaKimbaraSisaku;

public class TFMondaishu {

	    //問題文を代入
	    String a1 = "マラリアを媒介する生物は、蚊である。";
	    String a2 = "ちんこがかゆくなる代表的なものはカビである。";
	    String a3 = "水虫とちんこがかゆくなる代表的なものは同じ";
	    String a4 = "日本人は北欧人に比べて、糖尿病になりやすい。";
	    String a5 = "医療の面から、学習者に勧められる。";

	    String a6 = "デング熱を媒介する生物は豚である。";
	    String a7 = "体内に吸収されにくい抗菌薬を服用すると、腸内細菌が増える。";
	    String a8 = "日本人は北欧人に比べて太りやすい。";
	    String a9 = "ダージリンは柑橘系の果実が入っている。";
	    String a10 = "5階から地上と、地下5階から地上までの直線距離は等しい。";

	    //正解が0,不正解が1
	    //問題番号と解答番号が一致するようになってる。
	    //例.   a1問題の解答がb1
	    int b1 = 0;
	    int b2 = 0;
	    int b3 = 0;
	    int b4 = 0;
	    int b5 = 0;

	    int b6 = 1;
	    int b7 = 1;
	    int b8 = 1;
	    int b9 = 1;
	    int b10 =10;

	    public void show(){
	        System.out.println("Input 0 when you think next question is true.");
	        System.out.println("Input 1 when you think next question is false.");
	    }

	    public int qui1(){
	        System.out.println(a1);
	        this.show();
	        return b1;
	    }

	    public int qui2(){
	        System.out.println(a2);
	        this.show();
	        return b2;
	    }

	    public int qui3(){
	        System.out.println(a3);
	        this.show();
	        return b3;
	    }

	    public int qui4(){
	        System.out.println(a4);
	        this.show();
	        return b4;
	    }

	    public int qui5() {
	    	System.out.println(a5);
	    	this.show();
	    	return b5;
	    }

	    public int qui6() {
	    	System.out.println(a6);
	    	this.show();
	    	return b6;
	    }

	    public int qui7() {
	    	System.out.println(a7);
	    	this.show();
	    	return b7;
	    }

	    public int qui8() {
	    	System.out.println(a8);
	    	return b8;
	    }
	    public int qui9() {
	    	System.out.println(a9);
	    	return b9;
	    }

	    public int qui10() {
	    	System.out.println(a10);
	    	return b10;
	    }


}
