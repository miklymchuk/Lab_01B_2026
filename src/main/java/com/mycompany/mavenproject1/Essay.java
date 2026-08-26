/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 6312398
 */
public class Essay extends GradedActivity {
    double grammar;
    double spelling;
    double correctLength;
    double content;
    
    public void setScore(double grammar, double spelling, double correctLength, double content) {
        score = grammar + spelling + correctLength + content;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public void setContent(double content) {
        this.content = content;
    }

    public double getGrammar() {
        return grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getContent() {
        return content;
    }
    
    public double getScore() {
        return score;
    }
}
