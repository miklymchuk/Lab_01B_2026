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

    public PassFailExam(int numQuestions, double pointsEach, int numMissed, double minPassingScore) {
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.pointsEach = pointsEach;
        this.numMissed = numMissed;
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
}
