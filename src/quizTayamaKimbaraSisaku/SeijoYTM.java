package quizTayamaKimbaraSisaku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeijoYTM {

	public static int tokuten;//ランダム出題メソッド
	public static void syutuRan() throws IOException{
		int sum = 0;
		String[] q1 = new String[4];;
		String[] q2 = new String[6];
		String[] q3 = new String[7];
		String[] q4 = new String[4];
		String[] q5 = new String[6];
		String[] q6 = new String[4];
		String[] q7 = new String[4];

		int[] mon = BenriMethod.Rand(4);
        int mondaisu = 5; //《《《《《出題する問題数の設定》》》》》

		for(int i=0;i<mondaisu;i++) {
			switch(mon[i]) {
			case 1 :
				sum++;
				System.out.println("問" + sum);
				q1 = SeijoCole.Q1();
				int[] sen1 = BenriMethod.Ran(q1.length);
				for(int j=0;j<q1.length;j++) {
					System.out.print(j+1 + "." +q1[sen1[j]]+"　");
				}
				int[] tou1 = input(q1.length);


				seigo(sen1,tou1);
				break;

			case 2 :
				sum++;
				System.out.println("問" + sum);
				q2 = SeijoCole.Q2();
				int[] sen2 = BenriMethod.Ran(q2.length);
				for(int j=0;j<q2.length;j++) {
					System.out.print(j+1+"."+q2[sen2[j]]+"　");
				}
				int[] tou2 = input(q2.length);
				seigo(sen2,tou2);
				break;

			case 3 :
				sum++;
				System.out.println("問" + sum);
				q3 = SeijoCole.Q3();
				int[] sen3 = BenriMethod.Ran(q3.length);
				for(int j=0;j<q3.length;j++) {
					System.out.print(j+1+"."+q3[sen3[j]]+"　");
				}
				int[] tou3 = input(q3.length);
				seigo(sen3,tou3);
				break;

			case 4 :
				sum++;
				System.out.println("問" + sum);
				q4 = SeijoCole.Q4();
				int[] sen4 = BenriMethod.Ran(q4.length);
				for(int j=0;j<q4.length;j++) {
					System.out.print(j+1+"."+q4[sen4[j]]+"　");
				}
				int[] tou4 = input(q4.length);
				seigo(sen4,tou4);
				break;
			case 5 :
				sum++;
				System.out.println("問" + sum);
				q5 = SeijoCole.Q5();
				int[] sen5 = BenriMethod.Ran(q5.length);
				for(int j=0;j<q5.length;j++) {
					System.out.print(j+1+"."+q5[sen5[j]]+"　");
				}
				int[] tou5 = input(q5.length);
				seigo(sen5,tou5);
				break;
			case 6 :
				sum++;
				System.out.println("問" + sum);
				q6 = SeijoCole.Q6();
				int[] sen6 = BenriMethod.Ran(q6.length);
				for(int j=0;j<q6.length;j++) {
					System.out.print(j+1+"."+q6[sen6[j]]+"　");
				}
				int[] tou6 = input(q6.length);
				seigo(sen6,tou6);
				break;
			case 7 :
				sum++;
				System.out.println("問" + sum);
				q7 = SeijoCole.Q7();
				int[] sen7 = BenriMethod.Ran(q7.length);
				for(int j=0;j<q7.length;j++) {
					System.out.print(j+1+"."+q7[sen7[j]]+"　");
				}
				int[] tou7 = input(q7.length);
				seigo(sen7,tou7);
				break;

			}

		}

	}

	//桁数(n)を受け取って、答案を入力させ、桁ごとに分解する。

	public static int[] input(int n)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int tou = Integer.parseInt(str);

		int[] to = BenriMethod.bunkai(n, tou);
		return to;
	}

	public static void seigo(int[] mokai,int[] input) {


		switch(mokai.length) {
		case 4 :
			if(mokai[input[3]-1]==0&&mokai[input[2]-1]==1&&mokai[input[1]-1]==2&&mokai[input[0]-1]==3){
				System.out.println("正解!");
				tokuten++;
			}else {
				System.out.println("ハズレだよ！");
			}
			break;
		case 5 :
			if(mokai[input[4]-1]==0&&mokai[input[3]-1]==1&&mokai[input[2]-1]==2&&mokai[input[1]-1]==3&&mokai[input[0]-1]==4) {
				System.out.println("正解！");
				tokuten++;
			}else {
				System.out.println("ハズレだよ！");
			}
			break;
		case 6 :
			if(mokai[input[5]-1]==0&&mokai[input[4]-1]==1&&mokai[input[3]-1]==2&&mokai[input[2]-1]==3&&mokai[input[1]-1]==4&&mokai[input[0]-1]==5) {
				System.out.println("正解！");
				tokuten++;
			}else {
				System.out.println("ハズレだよ！");
			}
			break;
		case 7 :
			if(mokai[input[6]-1]==0&&mokai[input[5]-1]==1&&mokai[input[4]-1]==2&&mokai[input[3]-1]==3&&mokai[input[2]-1]==4&&mokai[input[1]-1]==5&&mokai[input[0]-1]==6) {
				System.out.println("正解！");
				tokuten++;
			}else {
				System.out.println("ハズレだよ！");
			}
			break;
		}

			}
}
