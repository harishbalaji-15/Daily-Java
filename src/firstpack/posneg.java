package firstpack;

import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n==0){
            System.out.println(n+" is 0");
        }
        else if(n>0){
            System.out.println(n+" is positive");
        }
        else{
            System.out.println(n+"is negative");
        }
    }
}
