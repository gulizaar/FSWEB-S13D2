package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }
    public static boolean isPalindrome(int sayi){
        sayi= Math.abs(sayi);
        int orjinalSayi= sayi;
        int reverse=0;
      while(sayi !=0){
          int basamak=sayi %10;
          reverse = reverse* 10 +basamak;
          sayi /=10;

      }
      if(reverse == orjinalSayi){
          return true;
      }else{
          return false;
      }


    }
    public static boolean isPerfectNumber(int sayi){
        if(sayi<0){
            return false;
        }
        int sum=0;
        for(int i=1;i<sayi;i++){
            if(sayi % i==0){
                sum  +=i;
            }
        }
        return sum == sayi;
    }
    public static String numberToWords(int sayi){
        String k ="";
        if(sayi<0){
            return "Invalid Value";
        }
        while(sayi >0){
            int digit = sayi% 10;
            switch (digit){
                case 0 :
                    k= "Zero "+k ;
                    break;
                case 1 :
                    k= "One " +k;
                    break;
                case 2:
                    k= "Two "+k ;
                    break;
                case 3:
                    k= "Three " +k;
                    break;
                case 4 :
                    k= "Four "+k ;
                    break;
                case 5 :
                    k= "Five " +k;
                    break;
                case 6 :
                    k= "Six "+k ;
                    break;
                case 7 :
                    k= "Seven " +k;
                    break;
                case 8 :
                    k= "Eight "+k ;
                    break;
                case 9 :
                    k= "Nine " +k;
                    break;

            }
            sayi/=10;

        }
        return k.trim();

    }
}
