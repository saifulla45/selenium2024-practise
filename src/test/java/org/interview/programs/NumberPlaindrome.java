package org.interview.programs;

public class NumberPlaindrome {
    public static void main(String[] args) {
        int number = 121;
        int reverseNumber = checkIfNumberIsPalindrome(number);
        if(reverseNumber == number) {
            System.out.println("Given Number is a palindrome");
        }
        else {
            System.out.println("Number is not plaindrome");
        }
    }
    public static int checkIfNumberIsPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp>0){
            rev = rev*10+(temp%10);
            temp = temp/10;
        }
        return rev;
    }
}
