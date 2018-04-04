import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Utilizando o método Scanner para alimentar a variavel N (tamanho do array) e M (quantidade de operações) */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        long [] array = new long[N + 1];
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            array[a-1] += k;
            array[b]   -= k;
        }
        scan.close();
        
        /* Achando valor máximo */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}


