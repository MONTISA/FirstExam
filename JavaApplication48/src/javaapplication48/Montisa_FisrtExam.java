/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication48;

import java.util.Scanner;

/**
 *
 * @author aeron
 */
public class Montisa_FisrtExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        String remarks;

        System.out.println("How many students will you enroll? ");
        int num = Integer.parseInt(scan.nextLine());

        String[][] student = new String[num][5];

        for (int i = 0; i < num; i++) {
            System.out.println("\n          STUDENT INFORMATION    \n");
            System.out.println("============================================");
            System.out.println("Student Name: ");
            student[i][0] = scan.nextLine();

            System.out.println("Address: ");
            student[i][1] = scan.nextLine();

            System.out.println("Grade Level: ");
            student[i][2] = scan.nextLine();

            System.out.println("Gender: ");
            student[i][3] = scan.nextLine();

            System.out.println("GWA (General Weighted Average): ");
            student[i][4] = scan.nextLine();
        }

        System.out.println("\n          ENROLLED STUDENT    \n");
        System.out.println("============================================");

        for (int i = 0; i < num; i++) {
            String name = student[i][0];
            String address = student[i][1];
            int grade = Integer.parseInt(student[i][2]);
            String gender = student[i][3];
            int gwa = Integer.parseInt(student[i][4]);

            if (gwa >= 75) {
                remarks = "PASSED";
            } else {
                remarks = "FAILED";
            }
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Full Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Grade Level: " + grade);
            System.out.println("Gender: " + gender);
            System.out.println("GWA (General Weighted Average): " + gwa);
            System.out.println("Remarks: " + remarks);
            System.out.println();
        }

        
    }
}
