package yontakumondai;

import java.io.IOException;

class teki {
 //ここからがフィールド
 int hp = 100;
 int mp = 50;

teki(){
	int sum = 0;
	sum++;
	System.out.println("問" + sum);
}

 //ここからがメソッド

 //まず攻撃メソッド
 int kougeki(int a) {
  System.out.println("敵の攻撃。");
  int b = a - mp;
  System.out.println(mp+"のダメージをうけた。");
  return b;
 }

 //hp回復メソッド
 void kaifuku() {
  int hp =+ 50;
 }
}

public class Main {
 public static void main(String[] args)throws IOException{

  //主人公作成
  int hp = 500;
  int mp = 300;

  System.out.println("戦闘を開始します。");

  //敵クラスのスライム(オブジェクト)を作る。
  teki suraimu = new teki();

  /*攻撃メソッドを呼び出す。
   * この時、攻撃メソッドを直接じゃなく、敵クラスのオブジェクトを使って、メソッドを呼び出すことになる。
   * 多分だけどこれが、javaがオブジェクト指向って言われてる所以
   */
  System.out.println("残りの体力が"+ suraimu.kougeki(hp) +"になった。");

 }

}