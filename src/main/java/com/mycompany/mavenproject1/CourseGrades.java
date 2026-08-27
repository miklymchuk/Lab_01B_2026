/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author mikly
 */
public class CourseGrades {
    GradedActivity[] grades = new GradedActivity[4];
    int NUM_GRADES = 4;
    
    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }
    
    public void setPassFailExam(PassFailExam passFailExam) {
        grades[1] = passFailExam;
    }
    
    public void setEssay(Essay essay) {
        grades[2] = essay;
    }
    
    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public String toString() {      
        return "Lab Score: " + grades[0].getScore() + " Grade: " + grades[0].getGrade()
        + "\nPass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[2].getGrade()        
        + "\nEssay Score: " + grades[2].getScore() + " Grade: " + grades[2].getGrade()
        + "\nFinal Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
    }     
}
