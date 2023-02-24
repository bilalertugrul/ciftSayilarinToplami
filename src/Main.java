import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları
toplayıp ekrana basan programı yazıyoruz.
         */
        int number=0, sum=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();
            if(number % 4 == 0){
                sum += number;
            }
         }while (number % 2 == 0);

        System.out.println("Toplam : " + sum);
    }
}