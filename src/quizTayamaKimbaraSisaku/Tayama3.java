package quizTayamaKimbaraSisaku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	public class Tayama3 {



			public static void main(String[] args)throws IOException{

				System.out.println("文字を入力してください。");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = br.readLine();

				String str1 = "あ";
				String str2 = "い";

				if(str.equals(str1)){
					System.out.println("あが入力されました。");
				}else if(str.equals(str2)){
					System.out.println("いが入力されました。");
				}else{
					System.out.println("others");
				}
			}
		}

