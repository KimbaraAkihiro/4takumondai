package quizTayamaKimbaraSisaku;

import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {
		TitleAndRule title = new TitleAndRule();
		Menu m = new Menu();
		title.showTitle(); //	起動。タイトル画面の表示
		int a;
		do{a = Menu.menu(); //メニューの表示
		} while(a != 1 && a != 3);
	    title.showEnd();
	}
}
