import java.util.ArrayList;
import java.util.Scanner;

public class Level2Ali {


        public static void main(String[] args) {
            int fibonacciToplam=0;
            int first =1;
            int second=1;
            int sayi1=12;
            int asalToplam = 0;
            ArrayList<Integer> fibonacciSayilari = new  ArrayList<Integer>();
            ArrayList<Integer> islemSayilari= new ArrayList<Integer>();
            ArrayList<Integer> asalSayiBolenleri= new ArrayList<Integer>();
            Scanner girdi=new Scanner(System.in);


            System.out.println("L�tfen bir say� giriniz:");
            int deger=girdi.nextInt();
            //Fibonacci Hesaplama Alan�
            for(int i=0;i<1;i++){

                for(int j=1;j<=100;j++){

                    fibonacciToplam=first+second;
                    second=first;
                    first=fibonacciToplam;
                    fibonacciSayilari.add(fibonacciToplam);
                    fibonacciToplam=0;

                }



            }
            //
            for(int sayi:fibonacciSayilari)
            {
                if(sayi>deger){
                    islemSayilari.add(sayi);
                }

            }


            System.out.println("Fibonacci dizisinde "+deger+"'den sonraki say� = "+islemSayilari.get(0));

            //////////////////�K�NC� KISIM/////////////////////////////

            System.out.println(sayi1+" say�s�n�n asal say� bolenleri:");
            for(int i=2;i<sayi1;i++){
                if(sayi1%i==0){
                    if(isPrime(i)==true){
                        asalSayiBolenleri.add(i);
                    }
                }
            }
            System.out.println(asalSayiBolenleri);

            for(int asal:asalSayiBolenleri){
                asalToplam+=asal;
            }
            System.out.println("Toplam�:"+asalToplam);

        }



        public static boolean isPrime(int p){
            if(p==2){
                return true;
            }
            for(int i=2;i<p;i++)
            {
                if(p%i==0){
                    return false;
                }
            }return true;
        }





}
