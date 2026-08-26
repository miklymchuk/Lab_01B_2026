/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 6312398
 */
public class PassFailExam extends PassFailActivity {
    int numQuestions;
    double pointsEach;
    int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointsEach = 100/numQuestions;
        score = pointsEach * (numQuestions - numMissed);
    }
    
    public int getNumQuestions() {
        return numQuestions;
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
}
