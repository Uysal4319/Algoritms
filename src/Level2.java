import java.util.*;



    public class Level2 {

        public static void main(String[] args) {
            Set<Integer> primeSet = new TreeSet<Integer>();
            Set<Long> fibonacciSet = new TreeSet<Long>();
            long sayi1 = 0L;                      //          Kodun ilerleyen kısımlarında kullanıcağım değişkenleri burada tanımladım.
            long sayi2 = 1L;                      //          değişlenleri long veri tipinde oluşturmamın nedeni fibonacci
            long sayi3 = 0L;                      //          sayılarının katlanarak gitmesinden dolayı işlemlerimde int in alacaği
            long girilen = 227000L;               //          max değerden büyük sayılar kullanmamdır.(Dez Avantajı programın performansı düştü sonuç geç görünüyor.


            for (int j = 0; j < 50; j++) {             // Hem fiboncci hem asal olan sayıları bu döngü içinde buldum.
                sayi3 = sayi1 + sayi2;                  //  Algoritmamda ilk iki sayının toplamını 3. sayıya atıyorum.
                sayi1 = sayi2;                        // Kaydırma işlemi yapıyorum.
                sayi2 = sayi3;                        // Kaydırma işlemi yapıyorum.
                if (isPrime((long) sayi3))        //Her fibonacci sayısının Asal olup olmadığını önceden oluşturduğum isPrime metodu ile control ediyorum.
                    fibonacciSet.add((long) sayi3);  // Sayı asalsa fibonacci setine ekliyorum.
            }



            long c=0;                    // X+1 i tutacak bir değişken tanımladım.
            String toplam = null;

            for(long s: fibonacciSet){ //Buradaki foreach dögüsü ile fiboncciSet içinden istenlen sayıdan büyük en küçük Asal fibonacci sayısını bulma işlemi yapıyorum.
                if(girilen<s){      //Verilen sayıdan büyük olan ilk asal fibonacci sayısını kontrol ediyorum.
                    System.out.println("227000 sayısından büyük olan minimum asal fibonacci = "+s);
                    c=s+1;
                    break;          // Buluğum ilk sayıda döngüden çıkıyorum.
                }

            }
            for (int i=1;i<=c/2;i++){// Bu döngüde step 2 de yapacağımız X+1 in asal bölenlerini bulmak için X+1 in yarısına kadarki asal sayıalrı buluyorum.
                if (isPrime(i)){
                    primeSet.add(i);
                }
            }

            List<Integer> list=new ArrayList<Integer>(); //X+1 sayısının asal bölenlerini tutmak için list tanımladım.
            int t=0;
            int total=0;
            Iterator<Integer> it=primeSet.iterator();//Asal sayıların bulunduğu primeSeti gezebilmek için bir iteratör oluşturdum.
            while (it.hasNext()){
                t=it.next();
                if(c%t==0){        //iteratorun üzerinde olduğu asal sayının X+1 sayısını tam bölüp bölmediğinin kontrollü.
                    total=total+t; // istenilen asal bölenlerin toplamı için aktarımlı toplama işlemi yapıyorum.
                    list.add(t);   // Asal böleni listte ekliyorum.
                }
            }

            System.out.println(fibonacciSet);//Asal fibonacci sayılarının yazdırıyorum.
            System.out.println("X+1= "+c);
            System.out.println("\n");

            for (Integer k: list){  //Sonucumun; X+1 sayısını tam bölen asal sayıların hangilerinin toplamından oluştuğunu göstermek için bu döngüyü oluşturdum.
                System.out.print(k+"+");
            }
            System.out.print(" = "+total);
        }

        public static boolean isPrime(long p){  // gelen long tipindeki sayının asal olup olmadığının kontolünü bu metotda yaptım.
            if (p==1){                          //1 asal sayı olmadığı için 1 gelirse önemsenmez atlanır.
                return false;
            }
            for (int i =2; i<=p/2;i++){     //asal sayılar 2 den başladığı için döngüyü 2 den başlattım. gelen sayının yarısına kadar olan sayıalrı kontrol etmemiz yeterli.
                if (p%i==0){
                    return false;           //gelen sayı herhangi bir i değerine tam bölünüyorsa asal değildir.
                }
            }return true;                   //Buraya kadar gelinebilmişse sayı asaldır.
        }
    }

