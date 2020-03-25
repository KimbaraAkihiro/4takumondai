package quizTayamaKimbaraSisaku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TFMain{
    public static void main(String[] args)throws IOException{
    	int tokuten = 0;
        System.out.println("ここでは○×のクイズを出すぜ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int monsu = 10;

        int[] ary = new int[10];
        for(int i = 0;i<ary.length;i++)
            ary[i] = i+1;
        for(int i = 0;i<ary.length;i++){
            int rnd = (int)(Math.random() * (double)ary.length);

            int w = ary[i];
            ary[i] = ary[rnd];
            ary[rnd] = w;
        }

        TFMondaishu sctf = new TFMondaishu();

        String str;
        int a;
        int b;

        for(int i=0;i<ary.length;i++){
            switch(ary[i]){
            case 1:
                a = sctf.qui1();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 2:
                a = sctf.qui2();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 3:
                a = sctf.qui3();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 4:
                a = sctf.qui4();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 5:
            	a = sctf.qui5();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 6:
            	a = sctf.qui6();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 7:
            	a = sctf.qui7();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 8:
            	a = sctf.qui8();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 9:
            	a = sctf.qui9();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;
            case 10:
            	a = sctf.qui10();
                str = br.readLine();
                b = Integer.parseInt(str);
                if(b != 0 && b != 1){
                    System.out.println("You must input 0 or 1.");
                }else if(a==b){
                        System.out.println("right.");
                        tokuten++;
                }else{
                        System.out.println("wrong.");
                }
                break;

            default:
                System.out.println("code error.");
            }

        }


        int aaa = sctf.qui1();
        str = br.readLine();
        b = Integer.parseInt(str);

        if(b != 0 && b != 1){
            System.out.println("You must input 0 or 1.");
        }else if(aaa==b){
                System.out.println("right.");
        }else{
                System.out.println("wrong.");
        }

        System.out.println("\n" + "終了だ！今回の数字クイズの正解数は10問中" + tokuten + "問だったぜ");
		TenKei.tfsei(tokuten, 10); //称号の表示


    }
}
