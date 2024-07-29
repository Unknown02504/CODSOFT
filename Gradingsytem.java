// in this program i am going to calculate grades according to average percentage 

import java.util.Scanner;

public class Gradingsytem{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int totalSubjects = sc.nextInt();
        int marks[] = new int[totalSubjects];
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter Marks of subject "+ (i+1) + " : ");
            marks[i] = sc.nextInt();
        }
        sc.close();
        int totalMarks = 0;
        for(int mark: marks ){
           totalMarks += mark;
        }
        int averagePercentage = totalMarks/totalSubjects;
        char grade;
        if(averagePercentage >= 90){
            grade = 'A';
        }
        else if(averagePercentage >= 80){
            grade = 'B';
        }
        else if(averagePercentage >= 70){
            grade = 'C';
        }
        else if(averagePercentage >= 60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade obtaine: " + grade);
    }
}