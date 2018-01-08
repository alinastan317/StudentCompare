/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author alistan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        // 1st input
        System.out.println("Enter the number of students : ");
        int number;
        number = in.nextInt();

        //Votes into array
        System.out.println("Please enter " + number + " student's Names and Scores");
        String nume;
        int score;
        Student[] studArray = new Student[number];

        for (int i = 0; i < number; i++) {
            nume = in.next();
            score = in.nextInt();
            studArray[i] = new Student(nume, score);
        }
        /*  Test
        Student std1 = new Student("aimee", 100);
        Student std2 = new Student("dave", 100);
        Student std3 = new Student("gerard", 50);
        Student std4 = new Student("antoine", 75);
        Student std5 = new Student("alexey", 150);
        Student[] studArray = {std1, std2, std3, std4, std5};
         */
        Checker check = new Checker();
        check.sort(studArray);
        for (Student std : studArray) {
            System.out.println(std.getName() + " " + std.getScore());
        }
    }
}
