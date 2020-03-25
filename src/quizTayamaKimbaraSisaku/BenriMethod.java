package quizTayamaKimbaraSisaku;

public class BenriMethod {

	//ランダムにしたn個の数字を返す。
	public static int[] Rand(int n) {
		int[] ary = new int[n];
		for(int i = 0;i<ary.length;i++)
				ary[i] = i+1;
		for(int i = 0;i<ary.length;i++) {
			int rnd = (int)(Math.random() * (double)ary.length);

			int w = ary[i];
			ary[i] = ary[rnd];
			ary[rnd] = w;
		}
		return ary;
	}

	//ランダムにした0-nまでの数字を返す。
	public static int[] Ran(int n) {
		int[] ary = new int[n];
		for(int i=0;i<ary.length;i++)
			ary[i] = i;
		for(int i=0;i<ary.length;i++) {
			int rnd = (int)(Math.random() * (double)ary.length);

			int w = ary[i];
			ary[i] = ary[rnd];
			ary[rnd] = w;
		}
		return ary;
	}

	//入力された数字を分解するメソッド
	public static int[] bunkai(int ketasuu, int touan) {
		int[] keta = new int[7];
		int kai = touan;
		int ketasu = ketasuu;

		switch(ketasuu) {
		case 4:
			keta[3] = kai/1000;
			keta[2] = (kai - keta[3]*1000)/100;
			keta[1] = (kai - keta[3]*1000 - keta[2]*100)/10;
			keta[0] = kai - keta[3]*1000 - keta[2]*100 - keta[1]*10;
		case 5 :
			keta[4] = kai/10000;
			keta[3] = (kai - keta[4]*10000)/1000;
			keta[2] = (kai - keta[4]*10000 - keta[3]*1000)/100;
			keta[1] = (kai - keta[4]*10000 - keta[3]*1000 - keta[2]*100)/10;
			keta[0] = kai - keta[4]*10000 - keta[3]*1000 - keta[2]*100 - keta[1]*10;
			break;
		case 6:
			keta[5] = kai/100000;
			keta[4] = (kai - keta[5]*100000)/10000;
			keta[3] = (kai - keta[5]*100000 - keta[4]*10000)/1000;
			keta[2] = (kai - keta[5]*100000 - keta[4]*10000 - keta[3]*1000)/100;
			keta[1] = (kai - keta[5]*100000 - keta[4]*10000 - keta[3]*1000 - keta[2]*100)/10;
		    keta[0] = kai - keta[5]*100000 - keta[4]*10000 - keta[3]*1000 - keta[2]*100 - keta[1]*10;
		    break;
		case 7:
			keta[6] = kai/1000000;
			keta[5] = (kai - keta[6]*1000000)/100000;
			keta[4] = (kai - keta[6]*1000000 - keta[5]*100000)/10000;
			keta[3] = (kai - keta[6]*1000000 - keta[5]*100000 - keta[4]*10000)/1000;
		    keta[2] = (kai - keta[6]*1000000 - keta[5]*100000 - keta[4]*10000 - keta[3]*1000)/100;
		    keta[1] = (kai - keta[6]*1000000 - keta[5]*100000 - keta[4]*10000 - keta[3]*1000 - keta[2]*100)/10;
		    keta[0] = kai - keta[6]*1000000 - keta[5]*100000 - keta[4]*10000 - keta[3]*1000 - keta[2]*100 - keta[1]*10;
		    break;
			}
		return keta;

	}

}
