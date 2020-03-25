package quizTayamaKimbaraSisaku;




	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	public class YonmonSentakushi {

	    public static void main(String[] args)throws IOException{
	        System.out.println("処理を開始します。");

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	        int[] ary = new int[4];
	        for(int i = 0;i<ary.length;i++)
	            ary[i] = i+1;
	        for(int i = 0;i<ary.length;i++){
	            int rnd = (int)(Math.random() * (double)ary.length);

	            int w = ary[i];
	            ary[i] = ary[rnd];
	            ary[rnd] = w;
	        }

	        Tayamano2 sctf = new Tayamano2();

	        String str;
	        int a;
	        int b=2;

	        for(int i=0;i<ary.length;i++){
	            switch(ary[i]){
	            case 1:
	                a = sctf.qui1();
	                str = new java.util.Scanner(System.in).nextLine();
	                if(str=="あ"){
	                    b = 0;
	                }
	                else if(str=="い"){
	                    b = 1;
	                }
	                else{
	                    System.out.println("You must input 〇 or ×");
	                }

	                if(a==b){
	                    System.out.println("right.");
	                }else if(a != b&&b==0||b==1){
	                    System.out.println("wrong.");
	                }else{
	                    System.out.println("We faild to run.");
	                }
	                break;
	            case 2:
	                a = sctf.qui2();
	                str = new java.util.Scanner(System.in).nextLine();
	                if(str=="あ")
	                b = 0;
	                else if(str=="い")
	                b = 1;
	                else
	                System.out.println("You must input 〇 or ×");
	                if(a==b){
	                    System.out.println("right.");
	                }else if(a != b&&b==0||b==1){
	                    System.out.println("wrong.");
	                }else{
	                    System.out.println("We faild to run.");
	                }
	                break;
	            case 3:
	                a = sctf.qui3();
	                str = new java.util.Scanner(System.in).nextLine();
	                if(str=="あ")
	                b = 0;
	                else if(str=="い")
	                b = 1;
	                else
	                System.out.println("You must input 〇 or ×");
	                if(a==b){
	                    System.out.println("right.");
	                }else if(a != b&&b==0||b==1){
	                    System.out.println("wrong.");
	                }else{
	                    System.out.println("We faild to run.");
	                }
	                break;
	            case 4:
	                a = sctf.qui4();
	                str = new java.util.Scanner(System.in).nextLine();
	                if(str=="あ")
	                b = 0;
	                else if(str=="い")
	                b = 1;
	                else
	                System.out.println("You must input 〇 or ×");
	                if(a==b){
	                    System.out.println("right.");
	                }else if(a != b&&b==0||b==1){
	                    System.out.println("wrong.");
	                }else{
	                    System.out.println("We faild to run.");
	                }
	                break;
	            default:
	                System.out.println("code error.");
	            }
	        }


	/*        a = sctf.qui1();
	        str = br.readLine();
	        b = Integer.parseInt(str);

	        if(b != 0 && b != 1){
	            System.out.println("You must input 0 or 1.");
	        }else if(a==b){
	                System.out.println("right.");
	        }else{
	                System.out.println("wrong.");
	        }
	 */
	    }
	}


