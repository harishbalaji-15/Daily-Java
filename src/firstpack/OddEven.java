package firstpack;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if(n%2 == 0){
            System.out.println(n+"is even");
        }
        else {
            System.out.println(n+"is odd");
        }
    }
}