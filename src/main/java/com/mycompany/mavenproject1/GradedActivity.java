/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 6312398
 */
public class GradedActivity {
    double score;
    
    public void setScore(double score) {
        this.score = score;
    }
    
    public double getScore() {
        return score;
    }
    
    public char getGrade() {
        if (score > 59) {
            return 'D';
        }
        if (score > 69) {
            return 'C';
        }
        if (score > 84) {
            return 'B';
        }
        if (score > 90) {
            return 'A';
        }
        return 'F';
    }
}
