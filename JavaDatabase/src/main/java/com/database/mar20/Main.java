package com.database.mar20;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int hang=1,lie=1;
        while (hang<=10) {
            while (lie<=hang) {
                System.out.print("* ");
                lie++;
            }
            System.out.print("\n");
            hang++;
            lie=1;
        }sc.close();
        }
    }
