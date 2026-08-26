/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 6312398
 */
public class PassFailActivity extends GradedActivity {
    protected double minPassingScore;
    
    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }
    
    public double getPassingScore() {
        return minPassingScore;
    }
    
    public char getGrade() {
        if (score > minPassingScore) {
            return 'P';
        }
        return 'F';
    }
}
