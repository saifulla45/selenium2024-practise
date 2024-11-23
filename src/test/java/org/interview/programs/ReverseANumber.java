package org.interview.programs;

public class ReverseANumber {

    public static void main(String[] args) {
        int num = 456;
        reverseNumber(num);
    }
    public static void reverseNumber(int num) {
        int rev = 0;
        while (num>0) {
             rev = rev*10+((num)%10);
             num = num/10;
        }
        System.out.println(rev);


    }
}
