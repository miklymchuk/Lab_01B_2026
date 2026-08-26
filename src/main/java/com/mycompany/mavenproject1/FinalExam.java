/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 6312398
 */
public class FinalExam extends GradedActivity {
    protected int numQuestions;
    protected double pointsEach;
    protected int numMissed;
    
    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach = 100/numQuestions;
        score = pointsEach * (numQuestions - numMissed);
    }
    
    public double getNumQuestions() {
        return numQuestions;
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
}
