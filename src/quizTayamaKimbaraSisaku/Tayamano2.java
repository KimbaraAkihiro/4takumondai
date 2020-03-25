package quizTayamaKimbaraSisaku;
public class Tayamano2{

    //問題文を代入
    String a1 = "Q1";
    String a2 = "Q2";
    String a3 = "Q3";
    String a4 = "Q4";

    //正解が0,不正解が1
    //問題番号と解答番号が一致するようになってる。
    //例.   a1問題の解答がb1
    int b1 = 0;
    int b2 = 1;
    int b3 = 1;
    int b4 = 0;

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

}