package com.example.HR_AppJava.HR_App;
import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }
}
