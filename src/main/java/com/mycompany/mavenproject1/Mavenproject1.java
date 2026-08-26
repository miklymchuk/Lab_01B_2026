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
        
        PassFailExam b = new PassFailExam(100, 25, 60.0);
        System.out.println("How many questions are on the final exam? " + b.getNumQuestions());
        System.out.println("How many questions did the student miss? " + b.getNumMissed());
        System.out.println("What is the minimum passing score? " + b.getPassingScore());
        System.out.println("Each question counts " + b.getPointsEach() + " points");
        System.out.println("The exam score is " + b.getScore());
        System.out.println("The exam grade is " + b.getGrade());
        
        Essay c = new Essay();
        c.setGrammar(25);
        c.setSpelling(18);
        c.setCorrectLength(20);
        c.setContent(25);
        c.setScore(25, 18, 20, 25);
        System.out.println("Term paper:");
        System.out.println("Grammar points: " + c.getGrammar());
        System.out.println("Spelling points: " + c.getSpelling());
        System.out.println("Length points: " + c.getCorrectLength());
        System.out.println("Content points: " + c.getContent());
        System.out.println("Total points: " + c.getScore());
        System.out.println("Grade: " + c.getGrade());
    }
}
