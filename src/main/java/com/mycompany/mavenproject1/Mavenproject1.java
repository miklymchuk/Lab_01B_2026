/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author 6312398
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        FinalExam a = new FinalExam(100, 25);
        System.out.println("How many questions are on the final exam? " + a.getNumQuestions());
        System.out.println("How many questions did the student miss? " + a.getNumMissed());
        System.out.println("Each question counts " + a.getPointsEach() + " points");
        System.out.println("The exam score is " + a.getScore());
        System.out.println("The exam grade is " + a.getGrade());
    }
}
